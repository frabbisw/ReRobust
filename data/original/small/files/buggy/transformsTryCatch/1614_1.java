@java.lang.Override
public void onBackPressed() {
    try {
        if (container.onBackHandle())
            return;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (keyboard.isCustomKeyboardVisible()) {
        keyboard.hideCustomKeyboard();
        return;
    }
    presenter.onBackPressed();
}
