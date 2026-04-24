package com.mybatisgx.example.spring.boot.controller;

import com.mybatisgx.example.spring.boot.entity.User;
import com.mybatisgx.example.spring.boot.entity.UserQuery;
import com.mybatisgx.example.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/add")
    public int add(@RequestBody User user) {
        return userService.add(user);
    }

    @DeleteMapping(path = "/delete")
    public int delete(Long id) {
        return userService.delete(id);
    }

    @PutMapping(path = "/modify")
    public int modify(@RequestBody User user) {
        return userService.modify(user);
    }

    @GetMapping("/id")
    public User findById(Long id) {
        return userService.findById(id);
    }

    @GetMapping("/list")
    public List<User> list(UserQuery userQuery) {
        return userService.list(userQuery);
    }
}
