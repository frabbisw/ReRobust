@java.lang.Override
public void onBackPressed() {
    try {
        myCountDownTimer.cancel();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    android.content.Intent intent = new android.content.Intent(this, com.randpdevs.calcoff.MainActivity.class);
    startActivity(intent);
}
