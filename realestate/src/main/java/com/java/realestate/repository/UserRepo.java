package com.java.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.realestate.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
}