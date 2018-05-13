# Spring boot security sample

> spring-boot 整合 spring-security 示例

采用的是独立的passport项目。
passport项目地址：[sillyfan-passport](https://github.com/huanDreamer/sillyfan-passport.git)

## 项目使用了 mongodb
```properties
spring.data.mongodb.host=<mongodb host>
spring.data.mongodb.port=<mongodb port>
spring.data.mongodb.database=<mongodb schema>
```


## 设置 security 认证地址
```properties
security.oauth2.resource.user-info-uri=http://localhost:8888/user
```
