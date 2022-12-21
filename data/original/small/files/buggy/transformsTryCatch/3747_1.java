public java.lang.String chatInput(java.lang.String displayText) {
    java.lang.String returnedText = "";
    try {
        returnedText = javax.swing.JOptionPane.showInputDialog(null, returnedText);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return returnedText;
}
