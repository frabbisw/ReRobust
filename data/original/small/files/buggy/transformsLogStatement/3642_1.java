@java.lang.Override
public void close() {
    connection.disconnect();
    connection = null;
    System.out.println("log");
    info.rynkowski.hamsterclient.data.dbus.ConnectionProviderOverNetwork.log.info("D-Bus connection closed.");
}
