@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
    imageView.setVisibility(View.VISIBLE);
    if (null != (mMediaPlayer)) {
        mMediaPlayer.stop();
        mMediaPlayer.reset();
        mMediaPlayer.release();
    }
    return false;
}
