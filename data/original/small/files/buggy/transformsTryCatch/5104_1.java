public void disconnect() {
    try {
        if ((serviceMessenger) != null) {
            disconnectFromService();
            context.unbindService(serviceConnection);
            state = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
