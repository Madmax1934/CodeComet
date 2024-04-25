package com.example.springaop.service;

import com.example.springaop.model.Student;
import com.example.springaop.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }


    public Optional<Student> getById(Integer id) {
        return Optional.of(studentRepository.findById(id).orElseThrow());
    }
}
