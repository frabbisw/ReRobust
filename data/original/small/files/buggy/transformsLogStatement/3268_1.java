protected void cutCmd() {
    app.getCopyPaste().copyToXML(app, app.getSelectionManager().getSelectedGeos(), false);
    System.out.println("log");
    deleteCmd(true);
}
