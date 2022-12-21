@java.lang.Override
public void close() {
    kafkaConsumerThreadPool.shutdown();
    isRunning.set(false);
    wakeup();
    System.out.println("log");
    while (!(kafkaConsumerThreadPool.isTerminated())) ;
}
