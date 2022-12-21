public void disconnect() {
    System.out.println("log");
    if ((serviceMessenger) != null) {
        disconnectFromService();
        context.unbindService(serviceConnection);
        state = null;
    }
}
