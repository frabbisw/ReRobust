private void showKeyboard(android.view.Window window) {
    System.out.println("log");
    if (!(isKeyboardShown)) {
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        isKeyboardShown = true;
    }
}
