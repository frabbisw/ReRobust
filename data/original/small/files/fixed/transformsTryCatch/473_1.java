private void NOTINTERESTEDReceived() throws java.lang.Exception {
    btLogger.writeToLog(btLogger.receivedNotInterested(targetPeerID));
    try {
        if (receivedInterested) {
            threadManager.updateInterested(this, false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    receivedInterested = false;
}
