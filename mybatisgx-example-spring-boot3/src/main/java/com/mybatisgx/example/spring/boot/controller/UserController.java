package com.mybatisgx.example.spring.boot.controller;

import com.mybatisgx.example.spring.boot.dao.UserDao;
import com.mybatisgx.example.spring.boot.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserDao userDao;

    @PostMapping
    public int add(@RequestBody User user) {
        return userDao.insert(user);
    }

    @DeleteMapping
    public int delete(Long id) {
        return userDao.deleteById(id);
    }

    @PutMapping
    public int modify(@RequestBody User user) {
        return userDao.updateByIdSelective(user);
    }

    @DeleteMapping("/id")
    public User findById(Long id) {
        return userDao.findById(id);
    }
}
