package com.demo.RedisImplementation.controller;

import com.demo.RedisImplementation.model.User;
import com.demo.RedisImplementation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> saveUser (@RequestBody User user){
        boolean result = userService.saveUser(user);
         if(result)
             return  ResponseEntity.ok("User created successfully");
         else
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/userData")
    public ResponseEntity <List<User>> fetchAllUser(){
        List<User> users;
        users= userService.fetchAllUser();
        return  ResponseEntity.ok(users);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity <User> fetchUserById(@PathVariable("id") Long id){
        User user;
        user = userService.fetchUserById(id);
        return  ResponseEntity.ok(user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser (@PathVariable("id") Long id, @RequestBody User user){
        boolean result = userService.deleteUser(id);
        if(result)
            return  ResponseEntity.ok("User deleted successfully");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @PutMapping("/userUpdate/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        boolean result = userService.updateUser(id,user);
        if(result)
            return ResponseEntity.ok("User Updated Successfully!!");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }



}
