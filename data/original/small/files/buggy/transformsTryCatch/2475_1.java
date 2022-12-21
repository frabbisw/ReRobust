@java.lang.Override
protected void onPause() {
    super.onPause();
    android.content.Intent intent;
    intent = new android.content.Intent(this, com.breadwallet.presenter.activities.MainActivity.class);
    startActivity(intent);
    try {
        if (!(isDestroyed())) {
            finish();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
