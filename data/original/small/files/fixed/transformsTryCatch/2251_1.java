@java.lang.Override
public void call() {
    try {
        mIsError.set(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
