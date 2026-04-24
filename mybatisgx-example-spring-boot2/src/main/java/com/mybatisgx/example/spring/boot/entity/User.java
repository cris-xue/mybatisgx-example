package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.*;
import lombok.Data;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "userList", fetch = FetchType.LAZY)
    @Fetch
    private List<Role> roleList;
}
