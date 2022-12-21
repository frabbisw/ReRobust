public void setActivePeerIP(java.lang.String host) {
    System.out.println("log");
    prop.setProperty("peer.active.ip", host.toString());
}
