spring-cloud 微服务示例
---
主要内容：

1. 服务注册与发现（eureka-server)
2. 配置中心(config-server)
2. 服务熔断(hystrix)
3. 微服务网关（包括：安全校验、灰度发布）-zuul

---
运行需知：

1.  服务注册（register-center)为了模拟HA，本机启用多实例，需要在hosts文件中加入 127.0.0.1  localhost server1 server2 server3，同时idea/eclipse中run时，可指定不同的profile(比如：server1、server2)来分2个端口启动。
2. service-consumer(服务消费者）及service-provider（服务提供者），为了演示灰度节点与正常节点的区分，也采用了多profile，分不同端口，在本机启动多实例。

---
调试启动顺序为： 

1. register-center(服务注册）
2. config-server(配置服务）
3. service-provider(服务提供者）
4. service-consumer(服务消费者)
5. service-gateway(微服务网关）

---
其它参考：

我的spring-cloud系列博客：
[http://www.cnblogs.com/yjmyzz/tag/spring-cloud/](http://www.cnblogs.com/yjmyzz/tag/spring-cloud/)

---
by [菩提树下的杨过](http://yjmyzz.cnblogs.com/) @2017

