public void stopLoading() {
    progress.dismiss();
    progress = null;
    try {
        org.wildstang.wildrank.android.data.DataManager.prepareForEject();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
