@java.lang.Override
public void close() {
    kafkaConsumerThreadPool.shutdown();
    try {
        isRunning.set(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    wakeup();
    while (!(kafkaConsumerThreadPool.isTerminated())) ;
}
