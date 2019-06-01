# eureka-server
eureka-server  服务发现注册服务器

Eureka 是Netflix 在线影片公司开源的一个服务注册与发现的组件
与Zookeeper 类似 
dubbo 推荐Zookeeper 

三大核心：
Register Service：服务注册中心，它是一个 Eureka Server，提供服务注册和发现的功能。
Provider Service：服务提供者 它是一个 Eureka Client，提供服务 。
Consumer Service：服务消费者，它是一个 Eureka Cient，消费服务。