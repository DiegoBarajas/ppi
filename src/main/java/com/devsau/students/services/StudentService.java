package com.devsau.students.services;

import com.devsau.students.models.StudentModel;
import com.devsau.students.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Get All students
    public List<StudentModel> findAll() {
        return (List<StudentModel>) studentRepository.findAll();
    }

    // Save a student
    public void save(StudentModel studentModel) {
        studentRepository.save(studentModel);
    }






}
