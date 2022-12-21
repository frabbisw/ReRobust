private synchronized boolean canSend() {
    System.out.println("log");
    return this.canSend_synch_lock;
}
