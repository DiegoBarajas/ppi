package com.devsau.students.services;

import com.devsau.students.models.StudentModel;
import com.devsau.students.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Get All students

    public List<StudentModel> findAll() {
        return (List<StudentModel>) studentRepository.findAll();
    }

    // Save a student
    public StudentModel save(StudentModel studentModel) {
        studentRepository.save(studentModel);
        return studentModel;
    }

    // Edit student



    // Delete student
    public String delete(int code) {
        Optional<StudentModel> student = studentRepository.findByCode(code);
        if (student.isPresent()) {
            studentRepository.delete(student.get());
            return "Student deleted successfully";
        }

        return "Student not found";
    }

    // Find student by code
    public Optional<StudentModel> findByCode(int code) {
        return studentRepository.findByCode(code);
    }






}
