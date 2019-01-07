SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS apply_role;




/* Create Tables */

-- 申请角色
CREATE TABLE apply_role
(
	ar_id bigint NOT NULL AUTO_INCREMENT COMMENT '角色申请ID',
	user_id bigint NOT NULL COMMENT '申请人ID',
	identity_name varchar(20) NOT NULL COMMENT '身份证名称',
	identity_number varchar(20) NOT NULL COMMENT '身份证号码',
	identity_front varchar(100) NOT NULL COMMENT '身份证正面照',
	identity_tergal varchar(100) NOT NULL COMMENT '身份证背面照',
	is_agreed boolean DEFAULT 'false' NOT NULL COMMENT '是否同意',
	ar_create_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
	ar_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '更新时间',
	PRIMARY KEY (ar_id)
) ENGINE = InnoDB COMMENT = '申请角色' DEFAULT CHARACTER SET utf8;

ALTER TABLE apply_role
   ADD CONSTRAINT FK_APPLY_ROLE_REFERENCE_USER FOREIGN KEY (user_id)
      REFERENCES user (user_id);


