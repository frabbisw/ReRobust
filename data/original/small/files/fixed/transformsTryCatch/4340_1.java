public static com.alibaba.otter.canal.client.CanalConnector newSingleConnector(java.net.SocketAddress address, java.lang.String destination, java.lang.String username, java.lang.String password) {
    com.alibaba.otter.canal.client.impl.SimpleCanalConnector canalConnector = new com.alibaba.otter.canal.client.impl.SimpleCanalConnector(address, username, password, destination);
    try {
        canalConnector.setSoTimeout((30 * 1000));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return canalConnector;
}