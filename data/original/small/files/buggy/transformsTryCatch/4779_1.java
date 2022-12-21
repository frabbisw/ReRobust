private void jButtonSquareRootActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String value = mathProc.Sqrt(numStorage.GetNumber());
    try {
        numStorage.SetDisplay(value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    UpdateDisplay();
}
