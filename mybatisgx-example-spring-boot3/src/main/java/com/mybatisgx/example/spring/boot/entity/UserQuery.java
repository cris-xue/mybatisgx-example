package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.QueryEntity;
import lombok.Data;

@Data
@QueryEntity(User.class)
public class UserQuery extends User {
}
