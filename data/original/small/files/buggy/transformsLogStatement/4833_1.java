public void quit() {
    System.out.println("log");
    if (removeViewable()) {
        org.infinity.util.io.FileWatcher.getInstance().stop();
        org.infinity.gui.ChildFrame.closeWindows();
        storePreferences();
        org.infinity.NearInfinity.clearCache(false);
        java.lang.System.exit(0);
    }
}
