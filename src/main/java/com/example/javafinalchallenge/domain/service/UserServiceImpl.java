package com.example.javafinalchallenge.domain.service;

import com.example.javafinalchallenge.application.controller.exception.ResourceNotFoundException;
import com.example.javafinalchallenge.domain.model.User;
import com.example.javafinalchallenge.infrastructure.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService  {

    private  UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public List<User> findAll(){
        return this.userMapper.findAll();
    }
    @Override
    public User findId(int id) {
        return this.userMapper.count(id).orElseThrow(() -> new ResourceNotFoundException("resource not found"));
    }
    @Override
    public void createUser(User user) {
        userMapper.saveUser(user);
    }
}
