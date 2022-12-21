@java.lang.Override
protected void onInsertComplete(int token, java.lang.Object cookie, android.net.Uri uri) {
    System.out.println("log");
    if ((mCallback.get()) != null) {
        mCallback.get().onInsertComplete();
    }
}
