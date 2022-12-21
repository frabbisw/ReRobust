public void onNewTab() {
    System.out.println("log");
    uk.co.nickthecoder.wrkfoo.tool.Home tool = new uk.co.nickthecoder.wrkfoo.tool.Home();
    mainWindow.addTab(tool);
    mainWindow.mainTabs.setSelectedIndex(((mainWindow.mainTabs.getTabCount()) - 1));
}
