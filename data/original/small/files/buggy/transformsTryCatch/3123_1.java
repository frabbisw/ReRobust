@java.lang.Override
public void onDestroy() {
    updateUI(Constants.UI.BUTTON, null);
    try {
        super.onDestroy();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
