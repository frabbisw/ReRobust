@java.lang.Override
public void onBackPressed() {
    try {
        if (keyboard.isCustomKeyboardVisible()) {
            keyboard.hideCustomKeyboard();
            return;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (container.onBackHandle())
        return;
    presenter.onBackPressed();
}
