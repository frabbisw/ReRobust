public void onNewTab() {
    uk.co.nickthecoder.wrkfoo.tool.Home tool = new uk.co.nickthecoder.wrkfoo.tool.Home();
    mainWindow.addTab(tool);
    try {
        mainWindow.mainTabs.setSelectedIndex(((mainWindow.mainTabs.getTabCount()) - 1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
