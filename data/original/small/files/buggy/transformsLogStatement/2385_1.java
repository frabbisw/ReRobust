@java.lang.Override
public void onSuccess(com.facebook.share.Sharer.Result shareResult) {
    System.out.println("log");
    bringBackWebView();
    android.util.Log.i("Share Success", "Shared to facebook");
}
