# RuoYi-Vue-Fast 企业级快速开发框架

> 基于若依框架深度定制的 Spring Boot 3 版本，专为现代化企业应用打造的高性能、高可用快速开发平台

## 📋 项目概述

本项目是基于开源的 RuoYi-Vue 框架进行二次开发的企业级快速开发平台，经过全面升级改造，完美适配最新的技术栈。项目采用单体架构设计，简化了部署和维护复杂度，同时保持了良好的模块化结构。

## 🚀 核心特性

### 技术栈升级

- **Spring Boot 3.x** - 全面拥抱最新 Spring 生态
- **Spring Security 6** - 现代化安全框架，增强的安全防护
- **JDK 17** - 长期支持版本，性能与安全双重保障
- **Redis 6/7** - 高性能缓存与会话管理
- **Druid 1.2.x** - 企业级数据库连接池
- **JJWT 0.11.x + HS512** - 安全的 JWT 令牌机制

### 架构优化

- **单体架构** - 简化部署，降低运维成本
- **模块化设计** - 清晰的代码结构，便于维护和扩展
- **扁平化依赖** - 统一的 POM 管理，避免版本冲突
- **前后端分离** - Vue.js 前端，RESTful API 后端

## 📁 项目结构

```
ruoyi-vue-fast/
├─ sql/                              # 数据库脚本
│  ├─ ry_xxxx.sql                   # 核心业务表结构
│  └─ quartz.sql                    # 定时任务相关表
├─ src/main/java/com/ruoyi/         # 主要源码目录 ★
│  ├─ RuoYiApplication.java         # 应用启动入口
│  ├─ common/                       # 公共模块
│  │  ├─ annotation/                # 自定义注解
│  │  ├─ config/                    # 配置类
│  │  ├─ constant/                  # 系统常量
│  │  ├─ core/                      # 核心封装
│  │  ├─ enums/                     # 枚举定义
│  │  ├─ exception/                 # 异常处理
│  │  ├─ json/                      # JSON 工具
│  │  ├─ utils/                     # 工具类集合
│  │  └─ xss/                       # XSS 防护
│  ├─ framework/                    # 框架配置
│  │  ├─ aspectj/                   # AOP 切面
│  │  ├─ config/                    # 框架配置
│  │  ├─ datasource/                # 多数据源
│  │  ├─ interceptor/               # 拦截器
│  │  ├─ manager/                   # 异步任务
│  │  ├─ security/                  # 安全认证
│  │  └─ web/                       # Web 配置
│  ├─ system/                       # 系统管理模块
│  │  ├─ controller/                # 控制层
│  │  ├─ domain/                    # 实体类
│  │  ├─ mapper/                    # 数据访问层
│  │  └─ service/                   # 业务逻辑层
│  ├─ generator/                    # 代码生成器
│  │  ├─ controller/                # 生成器控制器
│  │  ├─ domain/                    # 生成器实体
│  │  ├─ mapper/                    # 生成器数据层
│  │  ├─ service/                   # 生成器业务层
│  │  └─ util/                      # 生成工具类
│  └─ quartz/                       # 定时任务模块
│     ├─ controller/                # 任务控制器
│     ├─ domain/                    # 任务实体
│     ├─ mapper/                    # 任务数据层
│     ├─ service/                   # 任务业务层
│     └─ util/                      # 任务工具类
├─ src/main/resources/              # 资源文件
│  ├─ application.yml               # 主配置文件
│  ├─ application-druid.yml         # 数据源配置
│  ├─ logback.xml                   # 日志配置
│  ├─ i18n/                         # 国际化资源
│  ├─ mapper/                       # MyBatis 映射文件
│  ├─ mybatis/                      # MyBatis 配置
│  └─ vm/                           # 代码生成模板
├─ pom.xml                          # Maven 配置文件
└─ ruoyi-ui/                        # 前端 Vue 项目（Git 子模块）
```

## 🛠️ 系统功能

### 核心业务功能

1. **用户管理** - 系统用户的创建、编辑、删除和权限配置
2. **部门管理** - 组织架构管理，支持树形结构和数据权限
3. **岗位管理** - 职务配置，支持多岗位分配
4. **菜单管理** - 动态菜单配置，细粒度权限控制
5. **角色管理** - 基于角色的访问控制（RBAC）
6. **字典管理** - 系统字典数据统一管理
7. **参数管理** - 系统参数动态配置
8. **通知公告** - 系统消息发布与管理

### 系统监控功能

1. **操作日志** - 用户操作行为记录与审计
2. **登录日志** - 用户登录记录与安全监控
3. **在线用户** - 实时在线用户状态监控
4. **定时任务** - 可视化任务调度与监控
5. **系统接口** - API 接口文档自动生成
6. **服务监控** - 系统资源实时监控
7. **缓存监控** - Redis 缓存状态监控
8. **连接池监控** - 数据库连接池性能监控

### 开发辅助功能

1. **代码生成器** - 一键生成前后端 CRUD 代码
2. **在线构建器** - 可视化表单设计器

## 💡 技术亮点

### 安全性增强

- **JWT 安全认证** - 采用 HS512 算法的安全密钥
- **XSS 防护** - 全面的跨站脚本攻击防护
- **SQL 注入防护** - MyBatis 参数化查询
- **CSRF 防护** - 跨站请求伪造防护
- **接口限流** - 防止恶意请求攻击

### 性能优化

- **Redis 缓存** - 多级缓存策略，提升响应速度
- **连接池优化** - Druid 连接池性能调优
- **异步处理** - 异步任务处理，提升并发能力
- **SQL 优化** - 慢 SQL 监控与优化建议

### 开发效率

- **代码生成** - 支持单表、树表、主子表代码生成
- **热部署** - 开发环境代码热更新
- **API 文档** - Swagger 自动生成 API 文档
- **统一异常** - 全局异常处理机制

## 🔧 快速开始

### 环境要求

- **JDK 17+** - 推荐使用 OpenJDK 17
- **Maven 3.6+** - 依赖管理工具
- **MySQL 8.0+** - 主数据库
- **Redis 6.0+** - 缓存数据库
- **Node.js 16+** - 前端构建环境

### 部署步骤

1. **克隆项目**

   ```
   git clone [项目地址]
   cd ruoyi-vue-fast
   ```

2. **初始化数据库**

   ```
   # 创建数据库
   CREATE DATABASE ry_vue DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

   # 执行SQL脚本
   mysql -u root -p ry_vue < sql/ry_xxxx.sql
   mysql -u root -p ry_vue < sql/quartz.sql
   ```

3. **修改配置**

   ```
   # application-druid.yml
   spring:
     datasource:
       druid:
         master:
           url: jdbc:mysql://localhost:3306/ry_vue
           username: root
           password: your_password
   ```

4. **启动后端服务**

   ```
   mvn clean install
   java -jar target/ruoyi-admin.jar
   ```

5. **启动前端服务**

   ```
   cd ruoyi-ui
   npm install
   npm run dev
   ```

## 📈 版本特性

### Spring Boot 3 适配

- **原生编译支持** - GraalVM Native Image
- **性能提升** - 启动速度和内存占用优化
- **Java 17 特性** - 充分利用新语言特性
- **依赖升级** - 所有依赖升级到最新稳定版本

### Spring Security 6 增强

- **Lambda DSL** - 现代化的配置语法
- **方法级安全** - 细粒度权限控制
- **OAuth2 支持** - 现代化身份认证
- **CORS 优化** - 跨域请求处理

## 🤝 开发规范

- **代码风格** - 遵循阿里巴巴 Java 开发规范
- **注释规范** - 完整的 JavaDoc 注释
- **异常处理** - 统一的异常处理机制
- **日志规范** - 结构化日志记录
- **API 设计** - RESTful API 设计规范

## 🎯 适用场景

- **企业管理系统** - OA、CRM、ERP 等
- **电商后台系统** - 商品、订单、用户管理
- **内容管理系统** - CMS、博客系统
- **物联网平台** - 设备管理、数据采集
- **微服务网关** - API 网关、服务治理

## 📞 技术支持

本项目基于开源的 RuoYi 框架进行二次开发，在保持原有优秀特性的基础上，进行了现代化升级和性能优化，为企业级应用开发提供了强有力的技术支撑。

------

*持续更新中，更多功能特性敬请期待...*