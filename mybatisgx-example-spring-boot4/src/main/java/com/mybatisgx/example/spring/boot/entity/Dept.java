package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.*;
import lombok.Data;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Data
@Entity
@Table(name = "t_dept")
public class Dept {

    @Id
    @Column(name = "dept_id")
    private Long id;

    @Column(name = "dept_name")
    private String name;

    // 部门下的用户列表
    @OneToMany(mappedBy = "dept", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SIMPLE)
    private List<User> memberList;
}
