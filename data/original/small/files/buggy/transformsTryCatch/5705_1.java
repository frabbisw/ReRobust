public static void textPaneSettings(javax.swing.JTextPane outputDisplay) {
    outputDisplay.setEditable(false);
    outputDisplay.setFocusable(false);
    try {
        outputDisplay.setContentType("text/html");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    outputDisplay.putClientProperty(javax.swing.JTextPane.HONOR_DISPLAY_PROPERTIES, true);
}
