-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `id`   BIGINT(20) NOT NULL COMMENT '用户ID',
    `name` VARCHAR(100) DEFAULT NULL COMMENT '用户名',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户表';

-- 角色表
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`
(
    `id`   BIGINT(20) NOT NULL COMMENT '角色ID',
    `code` VARCHAR(50)  DEFAULT NULL COMMENT '角色编码',
    `name` VARCHAR(100) DEFAULT NULL COMMENT '角色名称',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_code` (`code`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='角色表';

-- 菜单表
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu`
(
    `id`   BIGINT(20) NOT NULL COMMENT '菜单ID',
    `code` VARCHAR(50)  DEFAULT NULL COMMENT '菜单编码',
    `name` VARCHAR(100) DEFAULT NULL COMMENT '菜单名称',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_code` (`code`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='菜单表';

-- 用户角色关联表
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`
(
    `user_id` BIGINT(20) NOT NULL COMMENT '用户ID',
    `role_id` BIGINT(20) NOT NULL COMMENT '角色ID',
    PRIMARY KEY (`user_id`, `role_id`),
    KEY `idx_user_id` (`user_id`),
    KEY `idx_role_id` (`role_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户角色关联表';

-- 角色菜单关联表
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu`
(
    `role_id` BIGINT(20) NOT NULL COMMENT '角色ID',
    `menu_id` BIGINT(20) NOT NULL COMMENT '菜单ID',
    PRIMARY KEY (`role_id`, `menu_id`),
    KEY `idx_role_id` (`role_id`),
    KEY `idx_menu_id` (`menu_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='角色菜单关联表';

-- ====================================
-- 示例数据（可选）
-- ====================================

-- 插入用户数据
INSERT INTO `user` (`id`, `name`)
VALUES (1, '张三'),
       (2, '李四'),
       (3, '王五');

-- 插入角色数据
INSERT INTO `role` (`id`, `code`, `name`)
VALUES (1, 'ADMIN', '管理员'),
       (2, 'USER', '普通用户'),
       (3, 'GUEST', '访客');

-- 插入菜单数据
INSERT INTO `menu` (`id`, `code`, `name`)
VALUES (1, 'USER_MANAGE', '用户管理'),
       (2, 'ROLE_MANAGE', '角色管理'),
       (3, 'MENU_MANAGE', '菜单管理'),
       (4, 'SYSTEM_CONFIG', '系统配置');

-- 插入用户角色关联数据
INSERT INTO `user_role` (`user_id`, `role_id`)
VALUES (1, 1), -- 张三是管理员
       (2, 2), -- 李四是普通用户
       (3, 3);
-- 王五是访客

-- 插入角色菜单关联数据
INSERT INTO `role_menu` (`role_id`, `menu_id`)
VALUES (1, 1), -- 管理员可访问用户管理
       (1, 2), -- 管理员可访问角色管理
       (1, 3), -- 管理员可访问菜单管理
       (1, 4), -- 管理员可访问系统配置
       (2, 1), -- 普通用户可访问用户管理
       (3, 1); -- 访客可访问用户管理
