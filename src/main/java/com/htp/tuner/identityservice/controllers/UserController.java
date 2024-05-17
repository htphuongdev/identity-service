package com.htp.tuner.identityservice.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.htp.tuner.identityservice.dto.requests.UserRequest;
import com.htp.tuner.identityservice.services.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public String getMethodName(@PathVariable String userId) {
        return "user_1";
    }

    @PostMapping("/")
    public String createNewUser(@RequestBody UserRequest userRequest) {
        log.info(userRequest.getDateOfBirth().toString());
        return "Created";
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable String userId, @RequestBody UserRequest userRequest) {
        return "Updated";
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "Deleted";
    }

    @GetMapping("/list")
    public String getListUser(@RequestParam(defaultValue = "0") int pageNo,
            @RequestParam(defaultValue = "10") int pageSize) {
        return "Users";
    }

}
