use atongtest;
create table if not exists user
(
    id                    bigint primary key auto_increment,
    phone                 varchar(20) not null comment '手机号',
    record_platform_count bigint      not null default 0 comment '记录的平台数量',
    create_time           datetime    not null comment '创建时间'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4 COMMENT ='用户表';