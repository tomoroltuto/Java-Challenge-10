package com.example.javafinalchallenge.domain.service;

import com.example.javafinalchallenge.domain.model.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public List<User> findAll();

    public User findId(int id);

    void createUser(User user);

}
