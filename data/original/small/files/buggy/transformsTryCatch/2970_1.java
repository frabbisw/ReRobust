private void showKeyboard(android.view.Window window) {
    try {
        if (!(isKeyboardShown)) {
            window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
            isKeyboardShown = true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
