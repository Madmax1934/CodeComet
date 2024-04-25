package com.example.hibernate2;

import com.example.hibernate2.entity.Prod;
import com.example.hibernate2.service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/prods")
public class Hibernate2Application {

	@Autowired
	private ProdService prodService;
	@GetMapping
	public List<Prod> getAllProds()
	{
		return prodService.findAllProds();
	}

	@PostMapping("/add")
	public void addProds(@RequestBody Prod prod)
	{
		prodService.addProd();
	}
	public static void main(String[] args) {
		SpringApplication.run(Hibernate2Application.class, args);
	}

}
