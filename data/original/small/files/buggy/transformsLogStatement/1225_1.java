private void initializeTabs() {
    pspTabs.addTab("Planning", web, planPanel, "Edit the plan");
    pspTabs.addTab("Design", web, designPanel, "Sketch a plan");
    this.add(pspTabs);
    System.out.println("log");
    pspTabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
}
