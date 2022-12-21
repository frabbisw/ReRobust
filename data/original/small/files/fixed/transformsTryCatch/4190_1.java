public void addTimeout(java.lang.Long timeout, java.net.DatagramPacket dp, int expectedAckNum) {
    try {
        timeoutList.add(timeout);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    timeoutToDatagramPacket.put(timeout, dp);
    ackNumToTimeout.put(expectedAckNum, timeout);
}
