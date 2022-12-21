public java.lang.String chatInput(java.lang.String displayText) {
    java.lang.String returnedText = "";
    try {
        returnedText = javax.swing.JOptionPane.showInputDialog(null, displayText);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return returnedText;
}
