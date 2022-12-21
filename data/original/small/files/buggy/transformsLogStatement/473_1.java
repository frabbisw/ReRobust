private void NOTINTERESTEDReceived() throws java.lang.Exception {
    System.out.println("log");
    btLogger.writeToLog(btLogger.receivedNotInterested(targetPeerID));
    if (receivedInterested) {
        threadManager.updateInterested(this, false);
    }
    receivedInterested = false;
    checkFullFile();
    threadManager.hasFullFile();
}
