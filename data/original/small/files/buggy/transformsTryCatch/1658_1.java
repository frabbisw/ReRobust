private org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryAbstractMessage prepare(org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryAbstractMessage msg, java.util.UUID destNodeId) {
    try {
        if (msg instanceof org.apache.ignite.spi.discovery.tcp.messages.TcpDiscoveryNodeAddedMessage)
            prepareNodeAddedMessage(msg, destNodeId, null, null, null, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return msg;
}
