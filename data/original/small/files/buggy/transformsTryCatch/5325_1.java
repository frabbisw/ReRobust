@java.lang.Override
public void onBackPressed() {
    try {
        super.onBackPressed();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sendIntent(null);
}
