public void setActivePeerIP(java.lang.String host) {
    try {
        prop.setProperty("peer.active.ip", host.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
