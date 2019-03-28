/*drop database repository;*/

create database repository;

use repository;

create table `object`(
	`id` bigint(64) not null auto_increment comment '物品id' primary key,
    `name` varchar(100) NOT NULL COMMENT '名称',
    `type` VARCHAR(100) NOT NULL COMMENT '类型',
    `uid` bigint(64) not null comment '用户id',
    `remark` varchar(200) comment '备注',
    `barcode` varchar(50) COMMENT '条形码'
)comment='用户物品表';

create table `user`(
	`uid` bigint(64) not null auto_increment comment 'id' primary key,
    `nickname` varchar(100) NOT NULL COMMENT '昵称',
    `password` varchar(200) NOT NULL COMMENT '密码'
)comment='用户表';

create table `objectcontain`(
	`packageid` bigint(64) not null comment '包装id',
    `objectid` bigint(64) not null comment '物品id',
    `status` varchar(1) not null comment '状态'
)comment='物品装箱关系表';