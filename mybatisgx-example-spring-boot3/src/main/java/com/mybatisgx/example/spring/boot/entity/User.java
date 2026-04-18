package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "userList")
    @Fetch
    private List<Role> roleList;
}
