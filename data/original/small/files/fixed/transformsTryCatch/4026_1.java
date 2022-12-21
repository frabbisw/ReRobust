public void onNewTab() {
    uk.co.nickthecoder.wrkfoo.tool.Home tool = new uk.co.nickthecoder.wrkfoo.tool.Home();
    try {
        mainWindow.addTab(tool);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
