# 查询用户列表

> curl http://localhost:8081/mybatisgx-example/user/list

- 请求结果

```json
[
  {
    "id": 1,
    "name": "张三",
    "dept": {
      "id": 2,
      "name": "部门2",
      "memberList": null
    },
    "roleList": [
      {
        "id": 1,
        "code": "ADMIN",
        "name": "管理员",
        "userList": null,
        "menuList": [
          {
            "id": 1,
            "code": "USER_MANAGE",
            "name": " 用户管理",
            "roleList": null
          },
          {
            "id": 2,
            "code": "ROLE_MANAGE",
            "name": "角色管理",
            "roleList": null
          },
          {
            "id": 3,
            "code": "MENU_MANAGE",
            "name": "菜单管理",
            "roleList": null
          },
          {
            "id": 4,
            "code": "SYSTEM_CONFIG",
            "name": "系统配置",
            "roleList": null
          }
        ]
      }
    ]
  },
  {
    "id": 2,
    "name": "李四",
    "dept": {
      "id": 1,
      "name": "部门1",
      "memberList": null
    },
    "roleList": [
      {
        "id": 2,
        "code": "USER",
        "name": "普通用户",
        "userList": null,
        "menuList": [
          {
            "id": 1,
            "code": "USER_MANAGE",
            "name": "用户管理",
            "roleList": null
          }
        ]
      }
    ]
  },
  {
    "id": 3,
    "name": "王五",
    "dept": {
      "id": 2,
      "name": "部门2",
      "memberList": null
    },
    "roleList": [
      {
        "id": 3,
        "code": "GUEST",
        "name": "访客",
        "userList": null,
        "menuList": [
          {
            "id": 1,
            "code": "USER_MANAGE",
            "name": "用户管理",
            "roleList": null
          }
        ]
      }
    ]
  }
]
```

# 用户列表【模糊查询】

curl -GX GET "http://localhost:8080/mybatisgx-example/user/list" --data-urlencode "nameLike=管理"

# 查询部门列表

> curl http://localhost:8081/mybatisgx-example/dept/list

- 请求结果

```json
[
  {
    "id": 1,
    "name": "部门1",
    "memberList": [
      {
        "id": 2,
        "name": "李四",
        "dept": {
          "id": 1,
          "name": null,
          "memberList": null
        },
        "roleList": [
          {
            "id": 2,
            "code": "USER",
            "name": "普通用户",
            "userList": null,
            "menuList": [
              {
                "id": 1,
                "code": "USER_MANAGE",
                "name": "用户管理",
                "roleList": null
              }
            ]
          }
        ]
      }
    ]
  },
  {
    "id": 2,
    "name": "部门2",
    "memberList": [
      {
        "id": 1,
        "name": "张三",
        "dept": {
          "id": 2,
          "name": null,
          "memberList": null
        },
        "roleList": [
          {
            "id": 1,
            "code": "ADMIN",
            "name": "管理员",
            "userList": null,
            "menuList": [
              {
                "id": 1,
                "code": "USER_MANAGE",
                "name": "用户管理",
                "roleList": null
              },
              {
                "id": 2,
                "code": "ROLE_MANAGE",
                "name": "角色管理",
                "roleList": null
              },
              {
                "id": 3,
                "code": "MENU_MANAGE",
                "name": "菜单管理",
                "roleList": null
              },
              {
                "id": 4,
                "code": "SYSTEM_CONFIG",
                "name": "系统配置",
                "roleList": null
              }
            ]
          }
        ]
      },
      {
        "id": 3,
        "name": "王五",
        "dept": {
          "id": 2,
          "name": null,
          "memberList": null
        },
        "roleList": [
          {
            "id": 3,
            "code": "GUEST",
            "name": "访客",
            "userList": null,
            "menuList": [
              {
                "id": 1,
                "code": "USER_MANAGE",
                "name": "用户管理",
                "roleList": null
              }
            ]
          }
        ]
      }
    ]
  }
]
```

# 部门列表【模糊查询】

curl -GX GET "http://localhost:8081/mybatisgx-example/dept/list" --data-urlencode "nameLike=1"