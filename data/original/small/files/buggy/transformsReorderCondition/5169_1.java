private void removeServerObjectReceivedListeners() {
    if (null != (serverObjectReceivedListener)) {
        network.removeServerObjectReceivedListener(serverObjectReceivedListener);
    }
}
