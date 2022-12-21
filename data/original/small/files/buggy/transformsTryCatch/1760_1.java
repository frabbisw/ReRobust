@java.lang.Override
public void onNext(T v) {
    try {
        onNext(v, innerScheduler.now());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
