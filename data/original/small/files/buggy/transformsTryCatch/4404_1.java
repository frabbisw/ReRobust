public void onClick(final android.content.DialogInterface dialog, final int which) {
    try {
        _actMain.PrepareMediaPlayer(localurl);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
