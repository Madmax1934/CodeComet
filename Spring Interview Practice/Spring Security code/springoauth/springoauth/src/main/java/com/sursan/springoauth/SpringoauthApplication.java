package com.sursan.springoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SpringoauthApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to spring security using Oauth";
	}

	@GetMapping("/user")
	public Principal getPrincipal(Principal principal){

		System.out.println("username: "+principal.getName());
		return principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringoauthApplication.class, args);
	}

}
