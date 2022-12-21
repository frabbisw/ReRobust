protected void done() {
    mntmOpenKml.setEnabled(true);
    System.out.println("log");
    if ((parse) != null) {
        mnExportAsKmz.setEnabled(true);
        mnExportAs.setEnabled(true);
    }
    progressBar.setVisible(false);
}
