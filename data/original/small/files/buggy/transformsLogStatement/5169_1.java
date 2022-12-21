private void removeServerObjectReceivedListeners() {
    System.out.println("log");
    if ((serverObjectReceivedListener) != null) {
        network.removeServerObjectReceivedListener(serverObjectReceivedListener);
    }
}
