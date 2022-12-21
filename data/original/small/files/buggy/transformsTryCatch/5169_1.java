private void removeServerObjectReceivedListeners() {
    try {
        if ((serverObjectReceivedListener) != null) {
            network.removeServerObjectReceivedListener(serverObjectReceivedListener);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
