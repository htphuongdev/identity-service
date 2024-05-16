package com.htp.tuner.identityservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htp.tuner.identityservice.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
