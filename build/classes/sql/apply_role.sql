SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS apply_role;




/* Create Tables */

-- �����ɫ
CREATE TABLE apply_role
(
	ar_id bigint NOT NULL AUTO_INCREMENT COMMENT '��ɫ����ID',
	user_id bigint NOT NULL COMMENT '������ID',
	identity_name varchar(20) NOT NULL COMMENT '���֤����',
	identity_number varchar(20) NOT NULL COMMENT '���֤����',
	identity_front varchar(100) NOT NULL COMMENT '���֤������',
	identity_tergal varchar(100) NOT NULL COMMENT '���֤������',
	is_agreed boolean DEFAULT 'false' NOT NULL COMMENT '�Ƿ�ͬ��',
	ar_create_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	ar_update_date timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '����ʱ��',
	PRIMARY KEY (ar_id)
) ENGINE = InnoDB COMMENT = '�����ɫ' DEFAULT CHARACTER SET utf8;

ALTER TABLE apply_role
   ADD CONSTRAINT FK_APPLY_ROLE_REFERENCE_USER FOREIGN KEY (user_id)
      REFERENCES user (user_id);


