package com.sursan.springsecurityJwt.service;

import com.sursan.springsecurityJwt.entity.User;
import com.sursan.springsecurityJwt.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public String addUser(User user)
    {
        userRepo.save(user);
        return "User is added successfully!!";
    }
}
