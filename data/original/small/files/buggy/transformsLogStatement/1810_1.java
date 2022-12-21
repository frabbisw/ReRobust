private void onError(java.lang.String message) {
    System.out.println("log");
    android.util.Log.d(com.juztoss.rhythmo.audio.AdvancedMediaPlayer.class.toString(), "onErrorCalled");
    if ((mOnErrorListener) != null)
        mOnErrorListener.onError(message);
}
