### LCN的演示代码

0.运行之前,做好数据的初始化.创建数据库shop_order和shop_member.对应的执行脚本分别在:

`shop-provider\member-server\src\main\resources\sql\shop_member.sql`

`shop-provider\order-server\src\main\resources\sql\shop_order.sql`

1.使用的是eureka作为注册中心，直接运行EurekaServerApplication.java就可以启动注册中心.

2.在shop-provider/member-server目录下运行MemberServerApplication.java,启动会员服务(端口8090).

3.在shop-provider/order-server目录下运行OrderServerApplication.java,启动订单服务(端口:8088).

4.打开浏览器发送请求: `http://127.0.0.1:8088/payOrder?orderNo=0001`,可以看到数据库shop_order中t_order对应的订单状态修改成1了，同时数据库shop_member中t_integral中对应用户的积分也增加了.

5.注意:目前这个案例是没有增加LCN分布式事务，是我们的基础项目.我们是基于这个项目去集成LCN

