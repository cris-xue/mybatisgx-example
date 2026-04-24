package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "userList", fetch = FetchType.LAZY)
    @Fetch(FetchMode.JOIN)
    private List<Role> roleList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
