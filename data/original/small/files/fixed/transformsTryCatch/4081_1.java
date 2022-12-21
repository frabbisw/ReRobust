@java.lang.Override
public void onDestroy() {
    updateUI(null);
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
