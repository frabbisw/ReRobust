@java.lang.Override
public java.net.Proxy getProxy() {
    System.out.println("log");
    java.net.SocketAddress addr = new java.net.InetSocketAddress("localhost", getSocksPort());
    java.net.Proxy proxy = new java.net.Proxy(java.net.Proxy.Type.SOCKS, addr);
    return proxy;
}
