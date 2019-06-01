# eureka-server
eureka-server  服务发现注册服务器

Eureka 是Netflix 在线影片公司开源的一个服务注册与发现的组件
与Zookeeper 类似 
dubbo 推荐Zookeeper 

三大核心：
Register Service：服务注册中心，它是一个 Eureka Server，提供服务注册和发现的功能。
Provider Service：服务提供者 它是一个 Eureka Client，提供服务 。
Consumer Service：服务消费者，它是一个 Eureka Cient，消费服务。


( l ) Register 服务注册
当 Eureka Client 向 Eureka Server 注册时 ， Eureka Client 提供自身的元数据，比如 IP 地址、
端口、运行状况H1标的 Uri 、 主页地址等信息。
(2) Renew 服务续约
Eureka C lient 在默认的情况下会每隔 30 秒发送一次心跳来进行服务续约。通过服务续约
来告知 Eureka Server 该 Eureka Client 仍然可用，没有出现故障。正常情况下，如果 Eureka Server
在 90 秒内没有收到 Eureka Client 的心跳， Eureka Server 会将 Eureka Client 实例从注册列表中
删除。注意：’盯网建议不要更 t&服务续约的间隔时间。
(3) Fetch Registries一一获取服务注册列表信息
Eureka Client 从 Eureka Server 获取服务注册表信息，井将其缓存在本地。 Eureka Client 会
使用服务注册列表信息查找其他服务的信息，从而进行远程调用。该注册列表信息定时（每
30 秒） 更新一次，每次返回注册列表信息可能与 Eureka Client 的缓存信息不同， Eureka Client
会自己处理这些信息。如呆由于某种原因导致注册列表信息不能及时匹配， Eureka Client 会重
新获取整个注册表信息。 Eureka Server 缓存了所有的服务注册列表信息，并将整个注册列表以
及每个应用程序的信息进行了压缩，压缩内容和没有压缩的内容完全相同。 Eureka Client 和
Eureka Server 可以使用 JSON 和 XML 数据格式进行通信。在默认的情况下， Eureka Client 使
用 JSON 格式的方式来获取服务注册列表的信息。

( 4) Cancel－一服务下线
Eureka Client 在程序关闭时可 以向 Eureka Server 发送下线请求。发送请求后，该客户端的
实例信息将从 Eureka Server 的服务注册列表中删除。该下线请求不会自动完成，需要在程序
关闭时调用以下代码：
DiscoveryManager . getinstance() .shutdownComponent();

( 5) Eviction一一服务剔除
在默认情况下，当 Eureka Client 连续 90 秒没有向 Eureka Server 发送服务续约（即心跳〉
时， Eureka Server 会将该服务实例从服务注册列表删除，即服务剔除。
## Eureka 高可用的成本  一般项目 负担不起 
Eureka Server 和 Eureka Client 。 而 Eureka
Client 又分为 Applicaton Service 和 Application Client ， 即服务提供者和服务消费者。每个区域
有一个 Eureka 集群 ， 并且每个区域至少有一个 Eureka Server 可 以处理区域故障 ， 以防服务器
瘫痪。


##  高可用的 Eureka server  高可用的nginx 







