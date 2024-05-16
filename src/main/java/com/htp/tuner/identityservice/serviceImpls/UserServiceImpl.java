package com.htp.tuner.identityservice.serviceImpls;

import com.htp.tuner.identityservice.repositories.UserRepository;
import com.htp.tuner.identityservice.services.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
}
