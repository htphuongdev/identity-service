package com.htp.tuner.identityservice.dto.requests;

import java.time.LocalDate;

import com.htp.tuner.identityservice.enums.Gender;

import lombok.Getter;

@Getter
public class UserRequest {
    private String phoneNumber;
    private String password;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dateOfBirth;
}
