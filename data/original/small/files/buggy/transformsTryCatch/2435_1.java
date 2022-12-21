void updateWindow(net.mready.hover.HoverWindow window) {
    try {
        checkWindow(window);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(window.attached)) {
        return;
    }
    windowManager.updateViewLayout(window.windowView, window.windowLayoutParams);
}
