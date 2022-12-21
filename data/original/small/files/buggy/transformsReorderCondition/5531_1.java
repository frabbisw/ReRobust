@java.lang.Override
public void onFail(int statusCode, @android.support.annotation.Nullable T failDate, @android.support.annotation.Nullable java.lang.Throwable error) {
    if (null != (mResponseCallback)) {
        mResponseCallback.onFail(statusCode, failDate, error);
    }
}
