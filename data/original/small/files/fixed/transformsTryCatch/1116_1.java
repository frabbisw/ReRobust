@java.lang.Override
public void connectionLost(java.lang.Throwable cause) {
    try {
        com.qhiehome.ihome.util.LogUtil.d(com.qhiehome.ihome.lock.gateway.GateWayClient.TAG, "The connection was lost");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
