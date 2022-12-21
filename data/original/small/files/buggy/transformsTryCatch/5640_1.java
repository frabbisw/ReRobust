protected org.threadly.concurrent.PriorityScheduler.Worker makeNewWorker(boolean increment) {
    org.threadly.concurrent.PriorityScheduler.Worker w = new org.threadly.concurrent.PriorityScheduler.Worker(this, threadFactory);
    if (increment) {
        currentPoolSize.incrementAndGet();
    }
    try {
        w.start();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return w;
}
