package com.mybatisgx.example.spring.boot.controller;

import com.mybatisgx.example.spring.boot.entity.Dept;
import com.mybatisgx.example.spring.boot.entity.DeptQuery;
import com.mybatisgx.example.spring.boot.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping(path = "/add")
    public int add(@RequestBody Dept dept) {
        return deptService.add(dept);
    }

    @DeleteMapping(path = "/delete")
    public int delete(@RequestParam("id") Long id) {
        return deptService.delete(id);
    }

    @PutMapping(path = "/modify")
    public int modify(@RequestBody Dept dept) {
        return deptService.modify(dept);
    }

    @GetMapping("/id")
    public Dept findById(@RequestParam("id") Long id) {
        return deptService.findById(id);
    }

    @GetMapping("/list")
    public List<Dept> list(DeptQuery deptQuery) {
        return deptService.list(deptQuery);
    }
}
