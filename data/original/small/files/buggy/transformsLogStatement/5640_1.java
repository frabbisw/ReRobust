protected org.threadly.concurrent.PriorityScheduler.Worker makeNewWorker(boolean increment) {
    org.threadly.concurrent.PriorityScheduler.Worker w = new org.threadly.concurrent.PriorityScheduler.Worker(this, threadFactory);
    System.out.println("log");
    if (increment) {
        currentPoolSize.incrementAndGet();
    }
    w.start();
    return w;
}
