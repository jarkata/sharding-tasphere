## [ShardingSphere - 构建异构数据库上层的标准和生态](https://shardingsphere.apache.org/index_zh.html)

**官方网站: https://shardingsphere.apache.org/**

### 概述

<hr>
基于ShardingSphere构建，主要目的如下:

- 1-学习源代码
- 2-按照自己的使用场景精简代码
- 3-按照自己的习惯及场景补充新的功能

<hr>

Apache ShardingSphere 产品定位为 `Database Plus`，旨在构建异构数据库上层的标准和生态。
它关注如何充分合理地利用数据库的计算和存储能力，而并非实现一个全新的数据库。ShardingSphere 站在数据库的上层视角，关注他们之间的协作多于数据库自身。

`连接`、`增强` 和 `可插拔` 是 Apache ShardingSphere 的核心概念。

- `连接：`通过对数据库协议、SQL 方言以及数据库存储的灵活适配，快速的连接应用与多模式的异构数据库；
- `增强：`获取数据库的访问流量，并提供流量重定向（数据分片、读写分离、影子库）、流量变形（数据加密、数据脱敏）、流量鉴权（安全、审计、权限）、流量治理（熔断、限流）以及流量分析（服务质量分析、可观察性）等透明化增强功能；
- `可插拔：`项目采用微内核 + 三层可插拔模型，使内核、功能组件以及生态对接完全能够灵活的方式进行插拔式扩展，开发者能够像使用积木一样定制属于自己的独特系统。

ShardingSphere 已于 2020 年 4 月 16 日成为 [Apache 软件基金会](https://apache.org/index.html#projects-list)的顶级项目。

迄今为止，已有超过 [10,000 个 GitHub 项目](https://github.com/search?l=Maven+POM&q=shardingsphere+language%3A%22Maven+POM%22&type=Code)
采用了 ShardingSphere。

### 文档📜

<hr>

[![EN d](https://img.shields.io/badge/document-English-blue.svg)](https://shardingsphere.apache.org/document/current/en/overview/)
[![CN doc](https://img.shields.io/badge/文档-中文版-blue.svg)](https://shardingsphere.apache.org/document/current/cn/overview/)

更多信息请参考：[https://shardingsphere.apache.org/document/current/cn/overview/](https://shardingsphere.apache.org/document/current/cn/overview/)

:soon: Version 5.5.2

我们目前正在开发 5.5.2 里程碑。
请访问[里程碑](https://github.com/apache/shardingsphere/milestones) 获取最新信息。

##

### 工作原理

<hr>

Apache ShardingSphere 由 JDBC、Proxy 这 2 款既能够独立部署，又支持混合部署配合使用的产品组成。
它们均提供标准化的数据水平扩展、分布式事务和分布式治理等功能，可适用于如 Java 同构、异构语言、云原生等各种多样化的应用场景。

### ShardingSphere-JDBC

<hr>

[![Maven Status](https://img.shields.io/maven-central/v/org.apache.shardingsphere/shardingsphere-jdbc.svg?color=green)](https://mvnrepository.com/artifact/org.apache.shardingsphere/shardingsphere-jdbc)

定位为轻量级 Java 框架，在 Java 的 JDBC 层提供的额外服务。
它使用客户端直连数据库，以 jar 包形式提供服务，无需额外部署和依赖，可理解为增强版的 JDBC 驱动，完全兼容 JDBC 和各种 ORM 框架。

:link: 更多信息请参考[官方网站](https://shardingsphere.apache.org/document/current/cn/overview/#shardingsphere-jdbc)。

### ShardingSphere-Proxy

<hr>

[![Nightly-Download](https://img.shields.io/static/v1?label=nightly-builds&message=download&color=orange)](https://nightlies.apache.org/shardingsphere/)
[![Download](https://img.shields.io/badge/release-download-orange.svg)](https://www.apache.org/dyn/closer.lua/shardingsphere/5.3.1/apache-shardingsphere-5.3.1-shardingsphere-proxy-bin.tar.gz)
[![Docker Pulls](https://img.shields.io/docker/pulls/apache/shardingsphere-proxy.svg)](https://store.docker.com/community/images/apache/shardingsphere-proxy)

定位为透明化的数据库代理端，提供封装了数据库二进制协议的服务端版本，用于完成对异构语言的支持。
目前提供 MySQL 和 PostgreSQL 版本，它可以使用任何兼容 MySQL/PostgreSQL 协议的访问客户端操作数据，对 DBA 更加友好。

:link: 更多信息请参考[官方网站](https://shardingsphere.apache.org/document/current/en/overview/#shardingsphere-proxy)。

|       | *ShardingSphere-JDBC* | *ShardingSphere-Proxy* |
|-------|-----------------------|------------------------|
| 数据库   | 任意                    | MySQL/PostgreSQL       |
| 连接消耗数 | 高                     | 低                      |
| 异构语言  | 仅 Java                | 任意                     |
| 性能    | 损耗低                   | 损耗略高                   |
| 无中心化  | 是                     | 否                      |
| 静态入口  | 无                     | 有                      |

### 混合架构

<hr>

ShardingSphere-JDBC 采用无中心化架构，与应用程序共享资源，适用于 Java 开发的高性能的轻量级 OLTP 应用；
ShardingSphere-Proxy 提供静态入口以及异构语言的支持，独立于应用程序部署，适用于 OLAP 应用以及对分片数据库进行管理和运维的场景。

Apache ShardingSphere 是多接入端共同组成的生态圈。
通过混合使用 ShardingSphere-JDBC 和
ShardingSphere-Proxy，并采用同一注册中心统一配置分片策略，能够灵活的搭建适用于各种场景的应用系统，使得架构师更加自由地调整适合于当前业务的最佳系统架构。

:link: 更多信息请参考[官方网站](https://shardingsphere.apache.org/document/current/en/overview/#hybrid-architecture)。

##

### 解决方案

<hr>

| *解决方案/功能* | *分布式数据库* | *数据安全*        | *数据库网关*        | *全链路压测* |
|-----------|----------|---------------|----------------|---------|
|           | 数据分片     | 数据加密          | 异构数据库支持        | 影子库     |
|           | 读写分离     | 行级权限（TODO）    | SQL 方言转换（TODO） | 可观测性    |
|           | 分布式事务    | SQL 审计（TODO）  |                |         |
|           | 弹性伸缩     | SQL 防火墙（TODO） |                |         |
|           | 高可用      |               |                |         |

##

### 线路规划

<hr>

![Roadmap](https://shardingsphere.apache.org/document/current/img/roadmap_cn.png)

##

### 如何构建 Apache ShardingSphere

<hr>

查看 [Wiki](https://github.com/apache/shardingsphere/wiki) 详细了解如何构建 Apache ShardingSphere。

##
