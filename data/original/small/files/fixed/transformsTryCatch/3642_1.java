@java.lang.Override
public void close() {
    try {
        if ((connection) != null) {
            connection.disconnect();
            connection = null;
            info.rynkowski.hamsterclient.data.dbus.ConnectionProviderOverNetwork.log.info("D-Bus connection closed.");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
