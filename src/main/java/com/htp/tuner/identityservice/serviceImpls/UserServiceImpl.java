package com.htp.tuner.identityservice.serviceImpls;

import org.springframework.stereotype.Service;

import com.htp.tuner.identityservice.repositories.UserRepository;
import com.htp.tuner.identityservice.services.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void createNewUser() {
        throw new UnsupportedOperationException("Unimplemented method 'createNewUser'");
    }
}
