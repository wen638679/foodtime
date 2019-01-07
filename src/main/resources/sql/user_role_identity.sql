SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS apply_role;
DROP TABLE IF EXISTS identity;
DROP TABLE IF EXISTS role;
DROP TABLE IF EXISTS user;




/* Create Tables */

-- �����ɫ
CREATE TABLE apply_role
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	ar_id varchar(20) NOT NULL COMMENT '��ɫ����ID',
	user_id varchar(20) NOT NULL COMMENT '������ID',
	identity_name varchar(20) NOT NULL COMMENT '���֤����',
	identity_number varchar(20) NOT NULL COMMENT '���֤����',
	identity_front varchar(100) NOT NULL COMMENT '���֤������',
	identity_tergal varchar(100) NOT NULL COMMENT '���֤������',
	-- 0δ��ˡ�1���ͨ����2��˲�ͬ��
	is_agreed binary DEFAULT '0' NOT NULL COMMENT '�Ƿ�ͬ��',
	ar_create_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	ar_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	zone varchar(100) NOT NULL COMMENT 'zone',
	zone_two varchar(200) NOT NULL COMMENT 'zone_two',
	zone_three varchar(500) NOT NULL COMMENT 'zone_three',
	PRIMARY KEY (id, ar_id),
	UNIQUE (ar_id)
) ENGINE = InnoDB COMMENT = '�����ɫ' DEFAULT CHARACTER SET utf8;


-- ���֤
CREATE TABLE identity
(
	id bigint NOT NULL COMMENT 'id',
	identity_id varchar(20) NOT NULL COMMENT '���֤ID',
	identity_number varchar(20) NOT NULL COMMENT '���֤����',
	identity_name varchar(20) NOT NULL COMMENT '���֤����',
	identity_front varchar(100) NOT NULL COMMENT '���֤������',
	identity_tergal varchar(100) NOT NULL COMMENT '���֤������',
	i_create_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	i_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	zone varchar(100) NOT NULL COMMENT 'Ԥ���ֶ�',
	zone_two varchar(200) NOT NULL COMMENT 'Ԥ���ֶ�2',
	zone_three varchar(500) NOT NULL COMMENT 'Ԥ���ֶ�3',
	PRIMARY KEY (id, identity_id, identity_number),
	UNIQUE (identity_id),
	UNIQUE (identity_number)
) ENGINE = InnoDB COMMENT = '���֤' DEFAULT CHARACTER SET utf8;


-- �û���ɫ
CREATE TABLE role
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	-- ��ɫID
	role_id varchar(20) NOT NULL COMMENT '��ɫID',
	-- ��ɫ����
	r_name varchar(20) NOT NULL COMMENT '��ɫ����',
	r_descript text COMMENT '��ɫ����',
	r_create_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	r_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	zone varchar(100) NOT NULL COMMENT 'Ԥ���ֶ�',
	zone_two varchar(200) NOT NULL COMMENT 'Ԥ���ֶ�2',
	zone_three varchar(500) NOT NULL COMMENT 'Ԥ���ֶ�3',
	PRIMARY KEY (id, role_id),
	UNIQUE (role_id),
	UNIQUE (r_name)
) ENGINE = InnoDB COMMENT = '�û���ɫ' DEFAULT CHARACTER SET utf8;


-- �û���
CREATE TABLE user
(
	id bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
	-- �û�ID
	user_id varchar(20) NOT NULL COMMENT '�û�ID',
	-- �û��˺�
	u_account varchar(20) NOT NULL COMMENT '�û��˺�',
	-- �û��ǳ�
	u_nick varchar(20) NOT NULL COMMENT '�û��ǳ�',
	-- ��ɫID
	role_id varchar(20) NOT NULL COMMENT '��ɫID',
	-- ���ID
	identity_id varchar(20) COMMENT '���ID',
	-- �û�ͷ��
	u_head_port varchar(100) COMMENT '�û�ͷ��',
	u_address varchar(100) COMMENT '��ַ',
	-- ����ʱ��
	u_create_update timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	u_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	zone varchar(100) NOT NULL COMMENT 'Ԥ���ֶ�1',
	zone_two varchar(200) NOT NULL COMMENT 'Ԥ���ֶ�2',
	zone_three varchar(500) NOT NULL COMMENT 'Ԥ���ֶ�3',
	PRIMARY KEY (id, user_id, u_account),
	UNIQUE (user_id),
	UNIQUE (u_account)
) ENGINE = InnoDB COMMENT = '�û���' DEFAULT CHARACTER SET utf8;

ALTER TABLE user
   ADD CONSTRAINT FK_USER_REFERENCE_ROLE FOREIGN KEY (role_id)
      REFERENCES role (role_id);
      
ALTER TABLE user
   ADD CONSTRAINT FK_USER_REFERENCE_IDENTITY FOREIGN KEY (identity_id)
      REFERENCES identity (identity_id);
      
ALTER TABLE apply_role
   ADD CONSTRAINT FK_APPLY_ROLE_REFERENCE_USER FOREIGN KEY (user_id)
      REFERENCES user (user_id);

