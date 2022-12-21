public int collectUserOption(java.lang.String question) {
    int response = 0;
    try {
        response = javax.swing.JOptionPane.showConfirmDialog(null, displayText, windowMessage, javax.swing.JOptionPane.PLAIN_MESSAGE, chatIcon);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return response;
}
