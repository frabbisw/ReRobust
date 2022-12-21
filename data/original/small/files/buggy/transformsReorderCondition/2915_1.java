private void restartTango() {
    if (null != (mParameterNode))
        mParameterNode.setPreferencesFromParameterServer();
    updateSaveMapButton();
    mTangoServiceClientNode.callTangoConnectService(TangoConnectRequest.RECONNECT);
}
