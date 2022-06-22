package com.danielrjorge.credentialmanager.controller;

import com.danielrjorge.credentialmanager.persistence.model.User;
import com.danielrjorge.credentialmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/user")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
