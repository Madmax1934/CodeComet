package com.example.Hibernate.demo1.controller;

import com.example.Hibernate.demo1.entity.Department;
import com.example.Hibernate.demo1.entity.Student;
import com.example.Hibernate.demo1.service.DepartmentService;
import com.example.Hibernate.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/add")
    public String addStudents(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping("/addAll")
    public String addStudents(@RequestBody List<Student> studentList){
        return studentService.addStudents(studentList);
    }

    @GetMapping("/getStudents")
    public List<Student> getStudents()
    {
        return studentService.getStudents();
    }

    @GetMapping("/getstudent/{id}")
    public Optional<Student> getStudent(@PathVariable int id)
    {
        return studentService.getStudent(id);
    }

    @GetMapping("/dep")
    public ResponseEntity<?> fetchAllDepartments()
    {
        return new ResponseEntity<List<Department>>(studentService.getAlldepartment(), HttpStatus.OK);
    }
}
