@java.lang.Override
public void onCompleted(boolean success, java.lang.String result, java.lang.Throwable throwable) {
    try {
        lock.openAll();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
