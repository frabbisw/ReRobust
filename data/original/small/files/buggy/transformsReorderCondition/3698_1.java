protected void done() {
    mntmOpenKml.setEnabled(true);
    if (null != (parse)) {
        mnExportAsKmz.setEnabled(true);
        mnExportAs.setEnabled(true);
    }
    progressBar.setVisible(false);
}
