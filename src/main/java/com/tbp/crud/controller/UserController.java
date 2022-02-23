package com.tbp.crud.controller;

import com.tbp.crud.entity.UserDetails;
import com.tbp.crud.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("/api/userdetails")
    public ResponseEntity<UserDetails> addUser(@Valid @RequestBody UserDetails user) {
        logger.info("Adding User");
        UserDetails createdUser = userService.createUser(user);
        return new ResponseEntity<UserDetails>(createdUser,HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/userdetails/{id}", produces = "application/json")
    public ResponseEntity<UserDetails> getUserById(@PathVariable int id) {
        logger.info("Retrieving  User by id");
        UserDetails userValue = userService.getUserById(id);
        return new ResponseEntity<UserDetails>(userValue, HttpStatus.OK);
    }

    @PutMapping("/api/userdetails/updateuser")
    public UserDetails updateUser(@Valid @RequestBody UserDetails user) {
        logger.info("updating user by ID");
        return userService.updateUser(user);
    }

}