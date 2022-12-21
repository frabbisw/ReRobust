public void setGrowthLastYears(java.lang.Integer lastYears) {
    java.lang.Integer old = this.properties.growthLastYears;
    try {
        properties.growthLastYears = ((ec.nbdemetra.ui.DemetraUI.GROWTH_LAST_YEARS) != null) ? lastYears : ec.nbdemetra.ui.DemetraUI.GROWTH_LAST_YEARS.defaultValue();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    firePropertyChange(ec.nbdemetra.ui.DemetraUI.GROWTH_CHART_LENGTH_PROPERTY, old, properties.growthLastYears);
}
