package com.mybatisgx.example.spring.boot.entity;

import com.mybatisgx.annotation.QueryEntity;
import lombok.Data;

@Data
@QueryEntity(Menu.class)
public class MenuQuery extends Menu {
}
