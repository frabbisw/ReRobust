public void showErrorDialog(java.lang.String title, java.lang.String message) {
    try {
        javax.swing.JOptionPane.showMessageDialog(this, message, title, javax.swing.JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
