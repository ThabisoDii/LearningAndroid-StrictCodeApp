package com.example.academy_intern.stric_code.interfaces;

import com.example.academy_intern.stric_code.models.User;

import java.util.List;

public interface IUser {

    public List<User> getAllUsers();
    public User onlineUser(String email,String password);
}
