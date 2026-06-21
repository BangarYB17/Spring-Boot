package com.exam.SB_JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.SB_JWT.entity.User;

public  interface UserRepository extends JpaRepository<User, Integer>{
        User findByUsername(String username);
}
