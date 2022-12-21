public static void shutdown() {
    com.misfit.ios.NuRemoteClient.close();
    com.misfit.ta.gui.Gui.stopApp();
    try {
        com.misfit.ta.gui.Gui.logger.info("Closing down. BYE!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
