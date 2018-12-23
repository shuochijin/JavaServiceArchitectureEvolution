create database topic;

use topic;

create table `demo`(
	`id` bigint(64) not null comment 'id' primary key,
    `name` varchar(100) NOT NULL COMMENT '名称',
    `value` VARCHAR(100) NOT NULL COMMENT '值'
);