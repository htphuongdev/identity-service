package com.htp.tuner.identityservice.controllers;

import org.springframework.stereotype.Controller;

import com.htp.tuner.identityservice.services.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {
    private final UserService userService;
}
