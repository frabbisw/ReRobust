private void restartTango() {
    try {
        if ((mParameterNode) != null)
            mParameterNode.setPreferencesFromParameterServer();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mTangoServiceClientNode.callTangoConnectService(TangoConnectRequest.RECONNECT);
}
