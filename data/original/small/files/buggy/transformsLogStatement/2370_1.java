@java.lang.Override
public void peerDeviceListUpdated(java.util.Collection<android.net.wifi.p2p.WifiP2pDevice> deviceList) {
    System.out.println("log");
    jobSocketListener.peerListUpdated(deviceList);
    if (com.minhld.multihop.supports.Utils.getConfig("role").equals("server")) {
        return;
    }
}
