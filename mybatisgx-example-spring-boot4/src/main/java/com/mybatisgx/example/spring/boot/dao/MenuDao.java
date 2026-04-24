package com.mybatisgx.example.spring.boot.dao;

import com.mybatisgx.dao.SimpleDao;
import com.mybatisgx.example.spring.boot.entity.Menu;
import com.mybatisgx.example.spring.boot.entity.MenuQuery;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuDao extends SimpleDao<Menu, MenuQuery, Long> {
}
