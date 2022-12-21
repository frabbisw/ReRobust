private void resume() {
    System.out.println("log");
    if (!(pendingPause.getAndSet(false))) {
        synchronized (lock) {
            lock.notify();
        }
    } else {
    }
}
