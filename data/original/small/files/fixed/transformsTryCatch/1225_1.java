private void initializeTabs() {
    try {
        pspTabs.addTab("Planning", web, planPanel, "Edit the plan");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    pspTabs.addTab("Design", web, designPanel, "Sketch a plan");
    this.add(pspTabs);
}
