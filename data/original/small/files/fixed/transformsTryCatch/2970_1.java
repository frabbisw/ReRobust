private void showKeyboard(android.view.Window window) {
    try {
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
