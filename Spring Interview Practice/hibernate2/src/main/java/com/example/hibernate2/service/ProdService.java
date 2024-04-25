package com.example.hibernate2.service;

import com.example.hibernate2.entity.Prod;
import com.example.hibernate2.repository.ProdRepo;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Service
public class ProdService {

    @Autowired
    ProdRepo prodRepo;

   public void addProd()
   {
       prodRepo.save(new Prod());
   }

    public List<Prod> findAllProds()
    {
        return prodRepo.findAll();
    }
}
