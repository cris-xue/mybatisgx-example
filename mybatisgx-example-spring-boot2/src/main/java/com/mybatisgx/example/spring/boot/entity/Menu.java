package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.*;
import lombok.Data;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Data
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    private Long id;

    private String code;

    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "role_menu",
            joinColumns = @JoinColumn(name = "menu_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    @Fetch
    private List<Role> roleList;
}
