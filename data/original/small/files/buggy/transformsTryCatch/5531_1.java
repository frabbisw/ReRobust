@java.lang.Override
public void onFail(int statusCode, @android.support.annotation.Nullable T failDate, @android.support.annotation.Nullable java.lang.Throwable error) {
    try {
        if ((mResponseCallback) != null) {
            mResponseCallback.onFail(statusCode, failDate, error);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
