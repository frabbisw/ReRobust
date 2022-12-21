private void NOTINTERESTEDReceived() throws java.lang.Exception {
    try {
        btLogger.writeToLog(btLogger.receivedNotInterested(targetPeerID));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (receivedInterested) {
        threadManager.updateInterested(this, false);
    }
    receivedInterested = false;
    checkFullFile();
    threadManager.hasFullFile();
}
