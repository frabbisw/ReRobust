public boolean peerDiscovery() {
    System.out.println("log");
    if (prop.isEmpty())
        return true;
    return java.lang.Boolean.parseBoolean(prop.getProperty("peer.discovery"));
}
