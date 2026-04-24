package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Entity
@Table(name = "role")
public class Role {

    @Id
    private Long id;

    private String code;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "join_mtm_user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @Fetch(FetchMode.JOIN)
    private List<User> userList;

    @ManyToMany(mappedBy = "roleList", fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    private List<Menu> menuList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }
}
