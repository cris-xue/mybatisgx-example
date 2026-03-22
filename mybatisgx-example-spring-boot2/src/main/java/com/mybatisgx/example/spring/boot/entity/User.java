package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.Entity;
import com.mybatisgx.annotation.Id;
import com.mybatisgx.annotation.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;

    private String name;
}
