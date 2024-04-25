package com.example.springaop.controller;

import com.example.springaop.model.College;
import com.example.springaop.model.Student;
import com.example.springaop.service.CollegeService;
import com.example.springaop.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CollegeController {
    @Autowired
    CollegeService collegeService;

    @GetMapping("/colleges")
    public List<College> getAllColleges()
    {
        return collegeService.getColleges();
    }
}
