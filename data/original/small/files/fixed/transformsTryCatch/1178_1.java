@java.lang.Override
public java.lang.Boolean call() throws java.lang.Exception {
    try {
        cyclicBarrier.await();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    long id = com.weibo.api.motan.util.RequestIdGenerator.getRequestId();
    boolean result = (memory.putIfAbsent(id, "")) == null;
    return result;
}
