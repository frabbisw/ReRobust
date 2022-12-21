@java.lang.Override
public void onNext(T v) {
    try {
        onNext(v, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
