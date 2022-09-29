package com.example.javafinalchallenge.application.controller;

import com.example.javafinalchallenge.domain.model.User;
import com.example.javafinalchallenge.domain.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll(){
        return userService.findAll();
    }
    @GetMapping("/{id}")
    public User getId(@PathVariable("id") int id){
        return userService.findId(id);
    }
    @PostMapping
    public ResponseEntity<String> create(@RequestBody @Validated User user) {
        userService.createUser(user);
        return ResponseEntity.ok("登録完了しました。");
    }
}
