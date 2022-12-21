@java.lang.Override
public void onBackPressed() {
    try {
        audioBackground.stop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.finish();
    java.lang.System.exit(0);
}
