public void setConsoleText(java.lang.String text) {
    LabelConsole.setText("Console got message:");
    ch.idsia.tools.LOGGER.println((text + "\nConsole got message:\n"), LOGGER.VERBOSE_MODE.INFO);
}
