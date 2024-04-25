package com.example.Hibernate.demo1.service;

import com.example.Hibernate.demo1.entity.Passport;
import com.example.Hibernate.demo1.repository.PassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassportService {

    @Autowired
    private PassportRepository passportRepository;

    List<Passport> passportList = new ArrayList<>();
//    List<Passport> passportList = List.of(
//         new Passport(4000,"EV12345"),
//         new Passport(40001,"NS12345"),
//         new Passport(4002, "LZ67890")
//    );

    public String addPassports(List<Passport> passportList){
        passportRepository.saveAll(passportList);
        return "passports added to the table";
    }




}
