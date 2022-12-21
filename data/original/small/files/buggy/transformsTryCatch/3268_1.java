protected void cutCmd() {
    try {
        app.getCopyPaste().copyToXML(app, app.getSelectionManager().getSelectedGeos(), false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    deleteCmd(true);
}
