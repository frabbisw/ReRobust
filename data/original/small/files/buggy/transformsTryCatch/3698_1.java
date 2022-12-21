protected void done() {
    mntmOpenKml.setEnabled(true);
    if ((parse) != null) {
        mnExportAsKmz.setEnabled(true);
        mnExportAs.setEnabled(true);
    }
    try {
        progressBar.setVisible(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
