SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS apply_role;
DROP TABLE IF EXISTS identity;
DROP TABLE IF EXISTS role;
DROP TABLE IF EXISTS user;




/* Create Tables */

-- 申请角色
CREATE TABLE apply_role
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	ar_id varchar(20) NOT NULL COMMENT '角色申请ID',
	user_id varchar(20) NOT NULL COMMENT '申请人ID',
	identity_name varchar(20) NOT NULL COMMENT '身份证名称',
	identity_number varchar(20) NOT NULL COMMENT '身份证号码',
	identity_front varchar(100) NOT NULL COMMENT '身份证正面照',
	identity_tergal varchar(100) NOT NULL COMMENT '身份证背面照',
	-- 0未审核、1审核通过，2审核不同过
	is_agreed binary DEFAULT '0' NOT NULL COMMENT '是否同意',
	ar_create_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
	ar_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '更新时间',
	zone varchar(100) NOT NULL COMMENT 'zone',
	zone_two varchar(200) NOT NULL COMMENT 'zone_two',
	zone_three varchar(500) NOT NULL COMMENT 'zone_three',
	PRIMARY KEY (id, ar_id),
	UNIQUE (ar_id)
) ENGINE = InnoDB COMMENT = '申请角色' DEFAULT CHARACTER SET utf8;


-- 身份证
CREATE TABLE identity
(
	id bigint NOT NULL COMMENT 'id',
	identity_id varchar(20) NOT NULL COMMENT '身份证ID',
	identity_number varchar(20) NOT NULL COMMENT '身份证号码',
	identity_name varchar(20) NOT NULL COMMENT '身份证名称',
	identity_front varchar(100) NOT NULL COMMENT '身份证正面照',
	identity_tergal varchar(100) NOT NULL COMMENT '身份证背面照',
	i_create_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
	i_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '更新时间',
	zone varchar(100) NOT NULL COMMENT '预留字段',
	zone_two varchar(200) NOT NULL COMMENT '预留字段2',
	zone_three varchar(500) NOT NULL COMMENT '预留字段3',
	PRIMARY KEY (id, identity_id, identity_number),
	UNIQUE (identity_id),
	UNIQUE (identity_number)
) ENGINE = InnoDB COMMENT = '身份证' DEFAULT CHARACTER SET utf8;


-- 用户角色
CREATE TABLE role
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	-- 角色ID
	role_id varchar(20) NOT NULL COMMENT '角色ID',
	-- 角色名称
	r_name varchar(20) NOT NULL COMMENT '角色名称',
	r_descript text COMMENT '角色描述',
	r_create_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
	r_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '更新时间',
	zone varchar(100) NOT NULL COMMENT '预留字段',
	zone_two varchar(200) NOT NULL COMMENT '预留字段2',
	zone_three varchar(500) NOT NULL COMMENT '预留字段3',
	PRIMARY KEY (id, role_id),
	UNIQUE (role_id),
	UNIQUE (r_name)
) ENGINE = InnoDB COMMENT = '用户角色' DEFAULT CHARACTER SET utf8;


-- 用户表
CREATE TABLE user
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	-- 用户ID
	user_id varchar(20) NOT NULL COMMENT '用户ID',
	-- 用户账号
	u_account varchar(20) NOT NULL COMMENT '用户账号',
	-- 用户昵称
	u_nick varchar(20) NOT NULL COMMENT '用户昵称',
	-- 角色ID
	role_id varchar(20) NOT NULL COMMENT '角色ID',
	-- 身份ID
	identity_id varchar(20) COMMENT '身份ID',
	-- 用户头像
	u_head_port varchar(100) COMMENT '用户头像',
	u_address varchar(100) COMMENT '地址',
	-- 创建时间
	u_create_update timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
	u_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '更新时间',
	zone varchar(100) NOT NULL COMMENT '预留字段1',
	zone_two varchar(200) NOT NULL COMMENT '预留字段2',
	zone_three varchar(500) NOT NULL COMMENT '预留字段3',
	PRIMARY KEY (id, user_id, u_account),
	UNIQUE (user_id),
	UNIQUE (u_account)
) ENGINE = InnoDB COMMENT = '用户表' DEFAULT CHARACTER SET utf8;

ALTER TABLE user
   ADD CONSTRAINT FK_USER_REFERENCE_ROLE FOREIGN KEY (role_id)
      REFERENCES role (role_id);
      
ALTER TABLE user
   ADD CONSTRAINT FK_USER_REFERENCE_IDENTITY FOREIGN KEY (identity_id)
      REFERENCES identity (identity_id);
      
ALTER TABLE apply_role
   ADD CONSTRAINT FK_APPLY_ROLE_REFERENCE_USER FOREIGN KEY (user_id)
      REFERENCES user (user_id);

