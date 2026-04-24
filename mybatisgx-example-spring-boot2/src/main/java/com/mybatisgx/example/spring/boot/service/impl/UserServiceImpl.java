package com.mybatisgx.example.spring.boot.service.impl;

import com.mybatisgx.example.spring.boot.dao.RoleDao;
import com.mybatisgx.example.spring.boot.dao.UserDao;
import com.mybatisgx.example.spring.boot.entity.Role;
import com.mybatisgx.example.spring.boot.entity.User;
import com.mybatisgx.example.spring.boot.entity.UserQuery;
import com.mybatisgx.example.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Autowired
    private RoleDao roleDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int add(User user) {
        this.userDao.insert(user);

        List<Role> roleList = user.getRoleList();
        this.roleDao.insertBatch(roleList);

        return 1;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int delete(Long id) {
        return this.userDao.deleteById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int modify(User user) {
        return this.userDao.updateById(user);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public User findById(Long id) {
        return this.userDao.findById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<User> list(UserQuery userQuery) {
        return this.userDao.findList(userQuery);
    }
}
