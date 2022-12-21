private void resume() {
    try {
        synchronized (lock) {
            if (!(pendingPause.getAndSet(false))) {
                lock.notify();
            } else {
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
