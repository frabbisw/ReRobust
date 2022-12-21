public void shutDown() {
    synchronized (this) {
        if (isShutDown) {
            return;
        }
        isShutDown = true;
    }
    try {
        for (final java.util.concurrent.CountDownLatch latch : latchesToCloseOnShutdown) {
            games.strategy.util.CountDownLatchHandler.releaseLatch(latch);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    latchesToCloseOnShutdown.clear();
}
