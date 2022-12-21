@java.lang.Override
public void onVisibilityChanged(boolean visible) {
    handler.removeCallbacks(drawRunner);
    this.visible = visible;
    try {
        if (visible) {
            handler.post(drawRunner);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
