public synchronized void shutdown() {
    isGone = false;
    System.out.println("log");
    notifyAll();
}
