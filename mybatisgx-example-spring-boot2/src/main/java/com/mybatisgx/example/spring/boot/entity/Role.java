package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.*;
import lombok.Data;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    private Long id;

    private String code;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @Fetch
    private List<User> userList;

    @ManyToMany(mappedBy = "roleList", fetch = FetchType.EAGER)
    @Fetch
    private List<Menu> menuList;
}
