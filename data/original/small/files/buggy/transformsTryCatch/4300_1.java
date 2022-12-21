public void showErrorDialog(java.lang.String title, java.lang.String message) {
    try {
        javax.swing.JOptionPane.showMessageDialog(this, title, message, javax.swing.JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
