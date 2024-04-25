package com.interviewgear.springvalidation.service;

import com.interviewgear.springvalidation.dto.UserDto;
import com.interviewgear.springvalidation.model.User;
import com.interviewgear.springvalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User saveUser(UserDto userDto)
    {
        User user=


        return userRepository.save(user);
    }
}
