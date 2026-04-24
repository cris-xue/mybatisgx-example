package com.mybatisgx.example.spring.boot.dao;

import com.mybatisgx.dao.SimpleDao;
import com.mybatisgx.example.spring.boot.entity.Role;
import com.mybatisgx.example.spring.boot.entity.RoleQuery;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends SimpleDao<Role, RoleQuery, Long> {
}
