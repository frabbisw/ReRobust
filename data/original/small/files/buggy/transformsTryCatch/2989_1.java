@java.lang.Override
public void onVisibilityChanged(boolean visible) {
    this.visible = visible;
    try {
        if (visible) {
            handler.post(drawRunner);
        } else {
            handler.removeCallbacks(drawRunner);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
