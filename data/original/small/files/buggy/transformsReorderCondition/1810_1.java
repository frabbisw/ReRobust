private void onError(java.lang.String message) {
    android.util.Log.d(com.juztoss.rhythmo.audio.AdvancedMediaPlayer.class.toString(), "onErrorCalled");
    if (null != (mOnErrorListener))
        mOnErrorListener.onError(message);
}
