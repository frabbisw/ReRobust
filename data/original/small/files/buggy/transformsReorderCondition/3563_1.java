@java.lang.Override
public void onLoading(nuclei.media.MediaPlayerController controller) {
    loading.setVisibility(View.VISIBLE);
    if (null != (mHandler))
        mHandler.start();
}
