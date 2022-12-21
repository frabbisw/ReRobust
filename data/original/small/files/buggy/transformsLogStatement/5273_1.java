@java.lang.Override
public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
    System.out.println("log");
    imageView.setVisibility(View.VISIBLE);
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
        mMediaPlayer.reset();
        mMediaPlayer.release();
    }
    return false;
}
