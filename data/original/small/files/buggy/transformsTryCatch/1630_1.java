private void economy_SMActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        lines.get(economy).set(2, "0");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
