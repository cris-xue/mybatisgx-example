package com.mybatisgx.example.spring.boot.service;

import com.mybatisgx.example.spring.boot.entity.User;
import com.mybatisgx.example.spring.boot.entity.UserQuery;

import java.util.List;

/**
 * @author：薛承城
 * @description：一句话描述
 * @date：2026/4/18 16:57
 */
public interface UserService {

    int add(User user);

    int delete(Long id);

    int modify(User user);

    User findById(Long id);

    List<User> list(UserQuery userQuery);
}
