package com.model.SB_Jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.SB_Jpa.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
       
}
