drop table if exists tbl_admin;
create table tbl_admin(
	id int(20) NOT NULL AUTO_INCREMENT COMMENT '����id',
	username varchar(255) NOT NULL COMMENT '�û���',
	password varchar(255) COMMENT '����',
	create_time bigint(20) DEFAULT NULL COMMENT '����ʱ��',
	status int(2) DEFAULT 1 COMMENT '״̬,1:����;0:ͣ��',
	PRIMARY KEY(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into tbl_admin(username,password) values('admin','a123456');