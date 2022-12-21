public synchronized boolean isOpened() {
    return ((pid) >= 0) && ((fd) >= 0);
}
