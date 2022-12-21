private void jButtonSquareRootActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        numStorage.SetDisplay(mathProc.Sqrt(numStorage.GetNumber()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    UpdateDisplay();
}
