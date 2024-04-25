package com.example.Hibernate.demo1.controller;

import com.example.Hibernate.demo1.entity.Passport;
import com.example.Hibernate.demo1.repository.PassportRepository;
import com.example.Hibernate.demo1.service.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/passports")
public class PassportController {

    @Autowired
    private PassportService passportService;

    @PostMapping("/addAll")
    public String addPassports(@RequestBody List<Passport> passportList)
    {
        return passportService.addPassports(passportList);
    }
}
