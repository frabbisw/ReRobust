@java.lang.Override
public void onSuccess(com.facebook.share.Sharer.Result shareResult) {
    bringBackWebView();
    try {
        android.util.Log.i("Share Success", "Shared to facebook");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
