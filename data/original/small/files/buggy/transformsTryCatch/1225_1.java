private void initializeTabs() {
    pspTabs.addTab("Planning", web, planPanel, "Edit the plan");
    pspTabs.addTab("Design", web, designPanel, "Sketch a plan");
    try {
        this.add(pspTabs);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    pspTabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
}
