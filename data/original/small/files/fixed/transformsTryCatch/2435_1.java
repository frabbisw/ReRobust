void updateWindow(net.mready.hover.HoverWindow window) {
    if (!(window.attached)) {
        return;
    }
    try {
        windowManager.updateViewLayout(window.windowView, window.windowLayoutParams);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
