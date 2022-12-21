public void testTabbarActionsEnablementForDiagram() {
    selectDiagram();
    try {
        checkEnabled(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    lockDiagram();
    checkEnabled(false);
}
