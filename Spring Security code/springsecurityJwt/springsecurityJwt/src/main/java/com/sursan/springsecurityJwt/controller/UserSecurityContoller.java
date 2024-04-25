package com.sursan.springsecurityJwt.controller;

import com.sursan.springsecurityJwt.entity.User;
import com.sursan.springsecurityJwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserSecurityContoller {

    @Autowired
    private UserService userService;

    @GetMapping("/add")
    public String addnew(@RequestBody User user)
    {
        return userService.addUser(user);
    }


}
