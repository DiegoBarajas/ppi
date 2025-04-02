package com.devsau.students.controllers;

import com.devsau.students.models.StudentModel;
import com.devsau.students.repositories.StudentRepository;
import com.devsau.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get All students
    @GetMapping("/students")
    public List<StudentModel> findAll() {
        return studentService.findAll();
    }

    // Save a student
    @PostMapping("/student")
    public StudentModel add(@RequestBody StudentModel student) {
        return studentService.save(student);
    }

    // Delete student
    @DeleteMapping("/student/{code}")
    public String delete(@PathVariable int code){
        return studentService.delete(code);
    }

    // Update student
    @PutMapping("/student/{code}")
    public StudentModel update(@RequestBody StudentModel student, @PathVariable int code) {
        Optional<StudentModel> existingStudent = studentService.findByCode(code);
        if (existingStudent.isPresent()) {
            StudentModel updatedStudent = existingStudent.get();

            updatedStudent.setCode(student.getCode());
            updatedStudent.setName(student.getName());
            updatedStudent.setEmail(student.getEmail());
            updatedStudent.setDegree(student.getDegree());
            updatedStudent.setScore(student.getScore());

            return studentService.save(updatedStudent);
        }
        return null;
    }


    // Get a student by code
    @GetMapping("/student/{code}")
    public Optional<StudentModel> findByCode(@PathVariable int code) {
        return studentService.findByCode(code);
    }

}
