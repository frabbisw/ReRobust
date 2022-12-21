protected final void registerFormulaListener(java.lang.String[] formulas, de.heinzen.probplugin.visualization.listener.FormulaListener listener) {
    try {
        controller.registerFormulaListener(formulas, listener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
