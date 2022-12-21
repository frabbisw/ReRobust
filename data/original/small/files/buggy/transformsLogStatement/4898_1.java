public synchronized boolean isOpened() {
    System.out.println("log");
    return ((fd) >= 0) && ((pid) >= 0);
}
