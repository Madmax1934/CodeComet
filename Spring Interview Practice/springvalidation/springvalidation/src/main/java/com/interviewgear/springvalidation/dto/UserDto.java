package com.interviewgear.springvalidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserDto {
    private String uname;
    private String email;
    private String mobile;
    private String gender;

    private int age;
    private String nationality;
}
