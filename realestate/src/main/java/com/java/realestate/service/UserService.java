package com.java.realestate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.realestate.Model.User;
import com.java.realestate.repository.UserRepo;



@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;

    public String getuserName(User user) {
        userRepo.save(user);
        return user.getName();
    }

    public List<User> getUserData() {
       List<User> li=new ArrayList<>(userRepo.findAll());
       return li;
    }
}