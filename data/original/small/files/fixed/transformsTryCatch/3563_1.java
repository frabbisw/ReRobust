@java.lang.Override
public void onLoading(nuclei.media.MediaPlayerController controller) {
    try {
        if ((loading) != null)
            loading.setVisibility(View.VISIBLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((mHandler) != null)
        mHandler.start();
}
