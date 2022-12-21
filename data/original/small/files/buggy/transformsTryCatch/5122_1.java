@java.lang.Override
protected void onInsertComplete(int token, java.lang.Object cookie, android.net.Uri uri) {
    try {
        if ((mCallback.get()) != null) {
            mCallback.get().onInsertComplete();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
