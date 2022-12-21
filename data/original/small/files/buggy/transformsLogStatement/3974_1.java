public void setConsoleText(java.lang.String text) {
    LabelConsole.setText("Console got message:");
    System.out.println("log");
    ch.idsia.tools.LOGGER.println(("\nConsole got message:\n" + text), LOGGER.VERBOSE_MODE.INFO);
}
