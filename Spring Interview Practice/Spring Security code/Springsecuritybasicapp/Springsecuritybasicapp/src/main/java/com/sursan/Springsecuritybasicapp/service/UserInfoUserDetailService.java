package com.sursan.Springsecuritybasicapp.service;

import com.sursan.Springsecuritybasicapp.config.UserInfoUserDetails;
import com.sursan.Springsecuritybasicapp.entity.User;
import com.sursan.Springsecuritybasicapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class UserInfoUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    public String addUser(User user)
    {
        userRepo.save(user);
        return "user added to the system!";
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user= userRepo.findByName(username);
        return user.map(UserInfoUserDetails::new)
                .orElseThrow(()->new UsernameNotFoundException("User Name not found..."));

    }
}
