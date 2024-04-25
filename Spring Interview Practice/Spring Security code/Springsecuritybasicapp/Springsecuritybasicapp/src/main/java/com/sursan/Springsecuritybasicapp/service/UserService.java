package com.sursan.Springsecuritybasicapp.service;

import com.sursan.Springsecuritybasicapp.entity.User;
import com.sursan.Springsecuritybasicapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public String addUser(User user)
    {
        userRepo.save(user);
        return "user added to the system!";
    }
}
