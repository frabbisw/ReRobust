@java.lang.Override
public void peerDeviceListUpdated(java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> deviceList) {
    try {
        jobSocketListener.peerListUpdated(deviceList);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
