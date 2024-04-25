package com.example.hibernate2.repository;

import com.example.hibernate2.entity.Prod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdRepo extends JpaRepository<Prod,Integer> {
}
