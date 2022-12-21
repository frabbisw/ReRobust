@java.lang.Override
public void onSessionDown(final org.opendaylight.protocol.bgp.rib.spi.BGPSession session, final java.lang.Exception e) {
    System.out.println("log");
    org.opendaylight.protocol.bgp.rib.impl.SimpleSessionListener.LOG.debug("Session Down", e);
    this.down = true;
}
