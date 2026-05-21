package com.mybatisgx.example.spring.boot.service;

import com.mybatisgx.example.spring.boot.entity.Dept;
import com.mybatisgx.example.spring.boot.entity.DeptQuery;

import java.util.List;

public interface DeptService {

    int add(Dept dept);

    int delete(Long id);

    int modify(Dept dept);

    Dept findById(Long id);

    List<Dept> list(DeptQuery deptQuery);
}
