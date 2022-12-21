public void disconnect() {
    if (null != (serviceMessenger)) {
        disconnectFromService();
        context.unbindService(serviceConnection);
        state = null;
    }
}
