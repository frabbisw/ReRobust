private void restartTango() {
    if ((mParameterNode) != null)
        mParameterNode.setPreferencesFromParameterServer();
    updateSaveMapButton();
    System.out.println("log");
    mTangoServiceClientNode.callTangoConnectService(TangoConnectRequest.RECONNECT);
}
