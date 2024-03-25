package com.example.springaop.controller;

import com.example.springaop.model.Student;
import com.example.springaop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        return studentService.getStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable(value = "id") Integer id){
        return studentService.getById(id);
    }
}
