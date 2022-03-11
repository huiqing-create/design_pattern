package structural_mode.proxy.dynamic_proxy;

//测试类
public class Client {
    public static void main(String[] args) {
        //获取代理工厂类
        ProxyFactory proxyFactory = new ProxyFactory();
        SellTickets selltickets = proxyFactory.getProxyObject();
        selltickets.sell();

    }
}
