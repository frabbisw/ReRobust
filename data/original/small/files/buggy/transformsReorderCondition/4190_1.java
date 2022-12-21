public void addTimeout(java.lang.Long timeout, java.net.DatagramPacket dp, int expectedAckNum) {
    java.lang.System.out.println((expectedAckNum + "connection.addTimeout: added timeout with expectedAckNum = "));
    timeoutList.add(timeout);
    timeoutToDatagramPacket.put(timeout, dp);
    ackNumToTimeout.put(expectedAckNum, timeout);
}
