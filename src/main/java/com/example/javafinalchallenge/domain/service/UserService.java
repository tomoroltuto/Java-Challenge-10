package com.example.javafinalchallenge.domain.service;

import com.example.javafinalchallenge.domain.model.User;
import java.util.List;


public interface UserService {

  List<User> findAll();

  User findId(int id);

  void createUser(User user);
}
