package com.mybatisgx.example.spring.boot.service.impl;

import com.mybatisgx.example.spring.boot.dao.DeptDao;
import com.mybatisgx.example.spring.boot.entity.Dept;
import com.mybatisgx.example.spring.boot.entity.DeptQuery;
import com.mybatisgx.example.spring.boot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public int add(Dept dept) {
        return deptDao.insert(dept);
    }

    @Override
    public int delete(Long id) {
        return deptDao.deleteById(id);
    }

    @Override
    public int modify(Dept dept) {
        return deptDao.updateById(dept);
    }

    @Override
    public Dept findById(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list(DeptQuery deptQuery) {
        return deptDao.findList(deptQuery);
    }
}
