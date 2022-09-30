package com.example.javafinalchallenge.domain.service;

import com.example.javafinalchallenge.domain.model.User;

import java.util.List;


public interface UserService {

    public List<User> findAll();

    public User findId(int id);

    void createUser(User user);

}
