@java.lang.Override
public void call() {
    try {
        mIsLoading.set(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mIsError.set(false);
}
