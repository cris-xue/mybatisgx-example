package com.mybatisgx.example.spring.boot.dao;

import com.mybatisgx.dao.SimpleDao;
import com.mybatisgx.example.spring.boot.entity.Dept;
import com.mybatisgx.example.spring.boot.entity.DeptQuery;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptDao extends SimpleDao<Dept, DeptQuery, Long> {
}