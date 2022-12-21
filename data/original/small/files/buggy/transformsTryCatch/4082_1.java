@java.lang.Override
protected org.uqbar.lacar.ui.model.ControlBuilder createBuilder(org.uqbar.lacar.ui.model.PanelBuilder container) {
    org.uqbar.lacar.ui.model.builder.StyledControlBuilder numericField = container.addNumericField(withDecimals);
    this.withFilter(new org.uqbar.arena.filters.NumericFilter());
    try {
        this.configureSkineableBuilder(numericField);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return numericField;
}