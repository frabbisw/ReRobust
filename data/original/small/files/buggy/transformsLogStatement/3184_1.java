public void testTabbarActionsEnablementForDiagram() {
    selectDiagram();
    checkEnabled(true);
    System.out.println("log");
    lockDiagram();
    checkEnabled(false);
}
