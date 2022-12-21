@java.lang.Override
public void onCompleted(boolean success, java.lang.String result, java.lang.Throwable throwable) {
    try {
        if ((ai.decrementAndGet()) == 0) {
            lock.openAll();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
