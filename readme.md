# redis

redis、jredis、redis 集群搭建、springboot 集成 redis

## 环境

- docker
- java8
- jedis
- spring-boot
- spring-initializr (用法见 gitlab 仓库： http://qtrj.i234.me:30000/nonsense/spring-initializr.git )

## 启动

https://github.com/docker-library/redis/issues/111

redis.conf 模板下载：
http://download.redis.io/redis-stable/redis.conf

打开单点注释，关闭集群注释

启动：
docker-compose up

关闭：
docker-compose down

关闭并删除数据卷：
docker-compose down --volumes

## jedis 测试

junit: jedis/AppTest

## spring-initializr

spring 官网无速度，自己搭建的办法见：spring-initializr 目录中的 Dockerfile
docker pull qtrj.i234.me:8084/kuzoncby/spring-initializr

## 集群

打开集群注释，关闭单点注释

启动：
docker-compose up

关闭：
docker-compose down

关闭并删除数据卷：
docker-compose down --volumes

测试项目：cluster
