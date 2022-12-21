public boolean peerDiscovery() {
    try {
        if (prop.isEmpty())
            return true;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return java.lang.Boolean.parseBoolean(prop.getProperty("peer.discovery"));
}
