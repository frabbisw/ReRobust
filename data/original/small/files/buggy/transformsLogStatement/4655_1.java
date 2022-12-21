@java.lang.Override
public void onCompleted(boolean success, java.lang.String result, java.lang.Throwable throwable) {
    System.out.println("log");
    if ((ai.decrementAndGet()) == 0) {
        lock.openAll();
    }
}
