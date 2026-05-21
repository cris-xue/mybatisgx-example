package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.QueryEntity;
import lombok.Data;

@Data
@QueryEntity(Dept.class)
public class DeptQuery extends Dept {

    private String nameLike;
}
