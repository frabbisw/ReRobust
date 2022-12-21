public static void disposeWindow() {
    if ((net.sf.memoranda.ui.App.frame) == null)
        return;
    try {
        java.lang.System.exit(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
