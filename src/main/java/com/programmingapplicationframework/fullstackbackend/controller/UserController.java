package com.programmingapplicationframework.fullstackbackend.controller;

import com.programmingapplicationframework.fullstackbackend.model.User;
import com.programmingapplicationframework.fullstackbackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//created by sathish
@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser){
        return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
