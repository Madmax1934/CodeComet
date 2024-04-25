package com.sursan.Springsecuritybasicapp.controller;

import com.sursan.Springsecuritybasicapp.entity.AuthRequest;
import com.sursan.Springsecuritybasicapp.entity.User;
import com.sursan.Springsecuritybasicapp.service.JwtService;
import com.sursan.Springsecuritybasicapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security")
public class SecurityController {

    @Autowired
    private JwtService jwtService;
    @Autowired
    UserService userService;
    @GetMapping("/basic")
    public String getRequest()
    {
        return "Display spring security application with security enabled";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to Spring boot security!!";
    }

    @PostMapping("/add/new")
    //@PreAuthorize("hasAuthority(ROLE_ADMIN)")
    public String addNewUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }

    @PostMapping("/authenticate")
    public String authenticateandgetToken(@RequestBody AuthRequest authRequest){
        return jwtService.generateToken(authRequest.getUsername());
    }
}
