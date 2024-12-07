## [Distributed SQL transaction & query engine for data sharding, scaling, encryption, and more - on any database.](https://shardingsphere.apache.org/)

**Official Website:** [https://shardingsphere.apache.org/](https://shardingsphere.apache.org/)

### OVERVIEW
<hr>
基于ShardingSphere构建，主要目的如下:

- 1-学习源代码
- 2-按照自己的使用场景精简代码
- 3-按照自己的习惯及场景补充新的功能
<hr>

Apache ShardingSphere is a distributed SQL transaction & query engine that allows for data sharding, scaling, encryption, and more - on any database. Our community's guiding development concept is Database Plus for creating a complete ecosystem that allows you to transform any database into a distributed database system. 

It focuses on repurposing existing databases, by placing a standardized upper layer above existing and fragmented databases, rather than creating a new database. 

The goal is to provide unified database services and minimize or eliminate the challenges caused by underlying databases' fragmentation. 
This results in applications only needing to communicate with a single standardized service.

The concepts at the core of the project are `Connect`, `Enhance` and `Pluggable`.

- `Connect:` Flexible adaptation of database protocol, SQL dialect and database storage. It can quickly connect applications and heterogeneous databases.
- `Enhance:` Capture database access entry to provide additional features transparently, such as: redirect (sharding, readwrite-splitting and shadow), transform (data encrypt and mask), authentication (security, audit and authority), governance (circuit breaker and access limitation and analyze, QoS and observability).
- `Pluggable:` Leveraging the micro kernel and 3 layers pluggable mode, features and database ecosystem can be embedded flexibly. Developers can customize their ShardingSphere just like building with LEGO blocks.

ShardingSphere became an [Apache](https://apache.org/index.html#projects-list) Top-Level Project on April 16, 2020.

So far, ShardingSphere has been used by over [10,000 projects on GitHub](https://github.com/search?l=Maven+POM&q=shardingsphere+language%3A%22Maven+POM%22&type=Code).

### DOCUMENTATION📜

<hr>

[![EN doc](https://img.shields.io/badge/document-English-blue.svg)](https://shardingsphere.apache.org/document/current/en/overview/)
[![CN doc](https://img.shields.io/badge/文档-中文版-blue.svg)](https://shardingsphere.apache.org/document/current/cn/overview/)

For full documentation & more details, visit: [Docs](https://shardingsphere.apache.org/document/current/en/overview/)

