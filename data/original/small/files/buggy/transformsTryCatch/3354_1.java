public static void disposeWindow() {
    if ((net.sf.memoranda.ui.App.frame) == null)
        return;
    try {
        net.sf.memoranda.ui.App.frame.dispose();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
