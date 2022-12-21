private void bindService() {
    android.content.Intent intent = new android.content.Intent(this, org.deviceconnect.android.deviceplugin.host.HostDeviceService.class);
    intent.setAction("camera");
    try {
        bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
