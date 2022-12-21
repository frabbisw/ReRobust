public void dispose() {
    deregisterClient();
    System.out.println("log");
    currentEndpointIdentifier = null;
}
