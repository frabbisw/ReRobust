@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
    try {
        imageView.setVisibility(View.VISIBLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
        mMediaPlayer.reset();
        mMediaPlayer.release();
    }
    return false;
}
