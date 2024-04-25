package com.interviewprep.restapp.controller;

import com.interviewprep.restapp.entity.User;
import com.interviewprep.restapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable int id)
    {
        Optional<User> user = userService.getUsers(id);
        return ResponseEntity.ok(user);
    }
}
