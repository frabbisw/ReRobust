private void restartTango() {
    if ((mParameterNode) != null)
        mParameterNode.setPreferencesFromParameterServer();
    try {
        updateSaveMapButton();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mTangoServiceClientNode.callTangoConnectService(TangoConnectRequest.RECONNECT);
}
