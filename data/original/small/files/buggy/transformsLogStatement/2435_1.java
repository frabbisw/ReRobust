void updateWindow(net.mready.hover.HoverWindow window) {
    checkWindow(window);
    if (!(window.attached)) {
        return;
    }
    System.out.println("log");
    windowManager.updateViewLayout(window.windowView, window.windowLayoutParams);
}
