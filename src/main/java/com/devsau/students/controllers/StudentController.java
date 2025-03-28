package com.devsau.students.controllers;

import com.devsau.students.models.StudentModel;
import com.devsau.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get All students
    @GetMapping("/students")
    public List<StudentModel> findAll() {
        return studentService.findAll();
    }

}
