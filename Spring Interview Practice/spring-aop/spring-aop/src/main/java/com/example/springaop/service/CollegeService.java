package com.example.springaop.service;

import com.example.springaop.model.College;
import com.example.springaop.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {
    @Autowired
    CollegeRepository collegeRepository;

    public List<College> getColleges()
    {
        return collegeRepository.findAll();
    }
}
