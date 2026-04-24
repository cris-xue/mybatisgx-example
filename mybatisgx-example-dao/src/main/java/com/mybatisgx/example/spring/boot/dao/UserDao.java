package com.mybatisgx.example.spring.boot.dao;

import com.mybatisgx.dao.SimpleDao;
import com.mybatisgx.example.spring.boot.entity.User;
import com.mybatisgx.example.spring.boot.entity.UserQuery;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends SimpleDao<User, UserQuery, Long> {
}
