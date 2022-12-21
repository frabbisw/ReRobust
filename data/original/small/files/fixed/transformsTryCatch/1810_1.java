private void onError() {
    try {
        android.util.Log.d(com.juztoss.rhythmo.audio.AdvancedMediaPlayer.class.toString(), "onErrorCalled");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mOnErrorListener) != null)
        mOnErrorListener.onError();
}
