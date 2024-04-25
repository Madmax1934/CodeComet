package com.example.Hibernate.demo1.service;

import com.example.Hibernate.demo1.entity.Department;
import com.example.Hibernate.demo1.entity.Student;
import com.example.Hibernate.demo1.repository.DepartmentRepo;
import com.example.Hibernate.demo1.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import org.apache.logging.slf4j.SLF4JLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private DepartmentRepo departmentRepo;

    List<Student> studentList = new ArrayList<>();
    public String addStudent(Student student)
    {
        studentRepository.save(student);
        return "Student added in the table";
    }

    public String addStudents(List<Student> studentList)
    {
        studentRepository.saveAll(studentList);
        return "students added to the table";
    }

    public List<Student> getStudents()
    {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(int id){
        System.out.println("Student record: "+studentRepository.findById(id).get());
        return studentRepository.findById(id);
    }

    public List<Department> getAlldepartment()
    {
        return departmentRepo.findAll();
    }
}
