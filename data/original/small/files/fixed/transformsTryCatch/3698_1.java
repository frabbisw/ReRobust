protected void done() {
    mnExportAs.setEnabled(true);
    try {
        mnExportAsKmz.setEnabled(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mntmOpenKml.setEnabled(true);
    progressBar.setVisible(false);
}
