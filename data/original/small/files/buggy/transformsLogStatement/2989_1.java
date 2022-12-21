@java.lang.Override
public void onVisibilityChanged(boolean visible) {
    this.visible = visible;
    System.out.println("log");
    if (visible) {
        handler.post(drawRunner);
    } else {
        handler.removeCallbacks(drawRunner);
    }
}
