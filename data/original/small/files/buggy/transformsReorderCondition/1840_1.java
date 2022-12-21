@java.lang.Override
public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
    if ((keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_UP)) || (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_DOWN))) {
        return true;
    }
    return false;
}
