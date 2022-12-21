private void launchMain() {
    time = 0;
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.mad.utsstudcentre.Controller.MainActivity.class);
    try {
        startActivity(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
}
