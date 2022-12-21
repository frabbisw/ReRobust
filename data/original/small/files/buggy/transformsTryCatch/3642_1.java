@java.lang.Override
public void close() {
    try {
        connection.disconnect();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    connection = null;
    info.rynkowski.hamsterclient.data.dbus.ConnectionProviderOverNetwork.log.info("D-Bus connection closed.");
}
