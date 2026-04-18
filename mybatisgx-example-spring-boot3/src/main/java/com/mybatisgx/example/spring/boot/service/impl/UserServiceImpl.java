package com.mybatisgx.example.spring.boot.service.impl;

import com.mybatisgx.example.spring.boot.dao.UserDao;
import com.mybatisgx.example.spring.boot.entity.User;
import com.mybatisgx.example.spring.boot.entity.UserQuery;
import com.mybatisgx.example.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author：薛承城
 * @description：一句话描述
 * @date：2026/4/18 16:58
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int add(User user) {
        return this.userDao.insert(user);
    }

    @Override
    public int addBatch(List<User> userList) {
        return this.userDao.insertBatch(userList);
    }

    @Override
    public int delete(Long id) {
        return this.userDao.deleteById(id);
    }

    @Override
    public int modify(User user) {
        return this.userDao.updateById(user);
    }

    @Override
    public User findById(Long id) {
        return this.userDao.findById(id);
    }

    @Override
    public List<User> list(UserQuery userQuery) {
        return this.userDao.findList(userQuery);
    }
}
