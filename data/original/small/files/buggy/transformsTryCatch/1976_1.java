@java.lang.Override
public void onSuccess() {
    android.util.Log.d("LoyalUtil", "picasso on success");
    try {
        callback.run();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
