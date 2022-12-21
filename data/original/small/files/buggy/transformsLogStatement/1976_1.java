@java.lang.Override
public void onSuccess() {
    System.out.println("log");
    android.util.Log.d("LoyalUtil", "picasso on success");
    callback.run();
}
