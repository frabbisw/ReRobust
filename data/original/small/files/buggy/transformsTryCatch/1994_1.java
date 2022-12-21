@java.lang.Override
public void onBackPressed() {
    audioBackground.stop();
    try {
        this.finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
