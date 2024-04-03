package com.java.realestate.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String gender;
    
    public User() {
    }
    public User(String name, String gender, Integer id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public Integer getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
    

    
  

}
