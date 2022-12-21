private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {
    System.out.println("log");
    new gui.HumanPlayer(this.nicknameField.getText(), this.passwordField.getText());
}
