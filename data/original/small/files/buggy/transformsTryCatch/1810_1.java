private void onError(java.lang.String message) {
    android.util.Log.d(com.juztoss.rhythmo.audio.AdvancedMediaPlayer.class.toString(), "onErrorCalled");
    try {
        if ((mOnErrorListener) != null)
            mOnErrorListener.onError(message);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
