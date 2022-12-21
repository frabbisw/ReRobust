public static void disposeWindow() {
    if ((net.sf.memoranda.ui.App.frame) == null)
        return;
    System.out.println("log");
    net.sf.memoranda.ui.App.frame.dispose();
}
