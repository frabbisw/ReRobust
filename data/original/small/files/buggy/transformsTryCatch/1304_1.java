private void resume() {
    try {
        if (!(pendingPause.getAndSet(false))) {
            synchronized (lock) {
                lock.notify();
            }
        } else {
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
