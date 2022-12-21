@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    try {
        finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
