@java.lang.Override
protected org.uqbar.lacar.ui.model.ControlBuilder createBuilder(org.uqbar.lacar.ui.model.PanelBuilder container) {
    org.uqbar.lacar.ui.model.builder.StyledControlBuilder numericField = container.addNumericField(withDecimals);
    try {
        this.withFilter(new org.uqbar.arena.filters.NumericFilter(withDecimals));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.configureSkineableBuilder(numericField);
    return numericField;
}
