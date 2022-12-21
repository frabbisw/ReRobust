@java.lang.Override
public void close() {
    kafkaConsumerThreadPool.shutdown();
    wakeup();
    try {
        while (!(kafkaConsumerThreadPool.isTerminated())) ;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    isRunning.set(false);
}
