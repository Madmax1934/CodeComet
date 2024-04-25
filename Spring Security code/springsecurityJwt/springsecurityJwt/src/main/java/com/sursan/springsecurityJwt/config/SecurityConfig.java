package com.sursan.springsecurityJwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    //authentication

    @Bean
    public UserDetailsService authenticate(){
        UserDetails userInfo = User.withDefaultPasswordEncoder()
                .username("Madmax")
                .password("12345")
                .build();

        return new InMemoryUserDetailsManager(userInfo);
    }

    //authorization
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    return http.authorizeHttpRequests((authz)->authz.anyRequest().authenticated())
            .httpBasic(Customizer.withDefaults())
            .build();


}

}
