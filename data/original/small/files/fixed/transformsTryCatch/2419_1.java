@java.lang.Override
protected void restoreState() {
    for (menu.ColorMenu.ComponentState comp : this.componentStates) {
        comp.setSelectedColorMode(comp.getActiveColorMode());
    }
    try {
        componentList.clearSelection();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    colorList.clearSelection();
}
