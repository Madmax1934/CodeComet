package com.sursan.Springsecuritybasicapp.config;

import com.sursan.Springsecuritybasicapp.service.UserInfoUserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SpringSecurityConfig {
/*
    //authentication
    @Bean
    public UserDetailsService userDetailsService(){
//        UserDetails adminUser = User.withDefaultPasswordEncoder()
//                .username("madmax")
//                .password("12345")
//                .roles("ADMIN")
//                .build();
//        //return new InMemoryUserDetailsManager(adminUser);
//
//        UserDetails userDetails = User.withDefaultPasswordEncoder()
//                .username("Sursan")
//                .password("dontask")
//                .roles("USER")
//                .build();
//
//        return new InMemoryUserDetailsManager(adminUser,userDetails);

        return new UserInfoUserDetailService();

    }

 */

    //authorization
//   @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//       return http.authorizeHttpRequests((authz)-> authz.anyRequest().authenticated())
//               .httpBasic(Customizer.withDefaults())
//               .build();
//   }



}
