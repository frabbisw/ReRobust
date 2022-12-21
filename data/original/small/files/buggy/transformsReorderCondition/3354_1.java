public static void disposeWindow() {
    if (null == (net.sf.memoranda.ui.App.frame))
        return;
    net.sf.memoranda.ui.App.frame.dispose();
}
