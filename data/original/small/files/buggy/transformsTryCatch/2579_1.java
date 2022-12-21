private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        new gui.HumanPlayer(this.nicknameField.getText(), this.passwordField.getText());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
