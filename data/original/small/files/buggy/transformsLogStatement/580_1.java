public void unsetConnectionServiceInternal(org.opendaylight.ovsdb.plugin.api.OvsdbConnectionService connectionService) {
    System.out.println("log");
    if ((this.connectionService) == connectionService) {
        this.connectionService = null;
    }
}
