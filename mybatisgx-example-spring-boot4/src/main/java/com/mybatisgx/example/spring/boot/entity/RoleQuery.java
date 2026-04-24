package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.QueryEntity;
import lombok.Data;

@Data
@QueryEntity(Role.class)
public class RoleQuery extends Role {
}
