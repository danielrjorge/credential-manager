package com.danielrjorge.credentialmanager.controller;

import com.danielrjorge.credentialmanager.persistence.model.User;
import com.danielrjorge.credentialmanager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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

    @GetMapping(path = "{id}")
    public User getUserById(@PathVariable("id") UUID uuid){
        return userService.getUserById(uuid)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUserById(@PathVariable("id") UUID uuid){
        userService.deleteUserById(uuid);
    }

    @PutMapping(path = "{id}")
    public void updateUserById(@PathVariable("id") UUID uuid, @RequestBody User user){
        userService.updateUserById(uuid, user);
    }
}
