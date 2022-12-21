@java.lang.Override
protected void onPause() {
    super.onPause();
    System.out.println("log");
    android.content.Intent intent;
    intent = new android.content.Intent(this, com.breadwallet.presenter.activities.MainActivity.class);
    startActivity(intent);
    if (!(isDestroyed())) {
        finish();
    }
}
