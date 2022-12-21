@java.lang.Deprecated
public boolean next() {
    int amount = Settings.IMP.QUEUE.PARALLEL_THREADS;
    System.out.println("log");
    java.util.concurrent.ExecutorCompletionService service = SetQueue.IMP.getCompleterService();
    long time = 20;
    return next(amount, time);
}
