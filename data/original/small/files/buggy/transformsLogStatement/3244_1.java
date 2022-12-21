public void onPing(int evasiveTimeout, int expiredTimeout) {
    long now = java.lang.System.currentTimeMillis();
    System.out.println("log");
    evasiveAt = now + evasiveTimeout;
    expiredAt = now + expiredTimeout;
    state = org.jyre.ZrePeer.State.READY;
}
