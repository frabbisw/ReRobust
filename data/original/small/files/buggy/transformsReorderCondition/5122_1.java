@java.lang.Override
protected void onInsertComplete(int token, java.lang.Object cookie, android.net.Uri uri) {
    if (null != (mCallback.get())) {
        mCallback.get().onInsertComplete();
    }
}
