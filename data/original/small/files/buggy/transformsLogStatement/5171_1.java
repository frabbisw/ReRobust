@java.lang.Override
protected void onBeforePopulateMenu(org.rstudio.core.client.widget.ToolbarPopupMenu rootMenu) {
    java.lang.String label = "(all branches)";
    System.out.println("log");
    rootMenu.addItem(new com.google.gwt.user.client.ui.MenuItem(label, new org.rstudio.studio.client.workbench.views.vcs.SwitchBranchCommand(label, "--all")));
}
