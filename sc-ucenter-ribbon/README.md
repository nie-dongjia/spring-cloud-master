# sc-ucenter-ribbon 
服务消费者 (ribbo客户端负载均衡)
## 服务消费者 


## 负载均衡 
常见的负载均衡有两种方式。 一种是独立进程单元，通过负载均衡策略，将请求转发到不同的执行单元上，例如 Ngnix。另一种是将负载均衡逻辑以代码的形式封装到服务消费者的客户端上，服务消费者客户端维护了 一份服务提供
者的信息列表 ，有了信息列表，通过负载均衡策略将请求分摊给多个服务提供者，从而达到负载均衡的目的。

Ribbon是Netflix发布的开源项目，主要功能是提供客户端的软件负载均衡算法，将Netflix的中间层服务连接在一起。Ribbon客户端组件提供一系列完善的配置项如连接超时，重试等。简单的说，就是在配置文件中列出Load Balancer后面所有的机器，Ribbon会自动的帮助你基于某种规则（如简单轮询，随即连接等）去连接这些机器。我们也很容易使用Ribbon实现自定义的负载均衡算法。

