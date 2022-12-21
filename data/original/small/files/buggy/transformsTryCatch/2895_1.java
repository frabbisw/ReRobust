private void objetButtonActionPerformed(java.awt.event.ActionEvent evt) {
    ObjectLabEnterpriseSoftware.PrinterBuildView Build = new ObjectLabEnterpriseSoftware.PrinterBuildView();
    try {
        Build.startMakeBuildProcess("objet");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    dispose();
}
