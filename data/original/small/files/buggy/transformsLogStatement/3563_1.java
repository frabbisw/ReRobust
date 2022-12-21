@java.lang.Override
public void onLoading(nuclei.media.MediaPlayerController controller) {
    System.out.println("log");
    loading.setVisibility(View.VISIBLE);
    if ((mHandler) != null)
        mHandler.start();
}
