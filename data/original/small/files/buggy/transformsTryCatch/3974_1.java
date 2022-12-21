public void setConsoleText(java.lang.String text) {
    try {
        LabelConsole.setText("Console got message:");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    ch.idsia.tools.LOGGER.println(("\nConsole got message:\n" + text), LOGGER.VERBOSE_MODE.INFO);
}
