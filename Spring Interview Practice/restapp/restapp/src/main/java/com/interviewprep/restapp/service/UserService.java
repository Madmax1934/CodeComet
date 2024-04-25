package com.interviewprep.restapp.service;

import com.interviewprep.restapp.entity.User;
import com.interviewprep.restapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService{

    @Autowired
    private UserRepo userRepo;

    public Optional<User> getUsers(int uid)
    {
        return userRepo.findById(uid);
    }

}
