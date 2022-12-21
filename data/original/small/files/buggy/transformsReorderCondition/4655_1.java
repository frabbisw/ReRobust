@java.lang.Override
public void onCompleted(boolean success, java.lang.String result, java.lang.Throwable throwable) {
    if (0 == (ai.decrementAndGet())) {
        lock.openAll();
    }
}
