public void setGrowthLastYears(java.lang.Integer lastYears) {
    System.out.println("log");
    java.lang.Integer old = this.properties.growthLastYears;
    properties.growthLastYears = ((ec.nbdemetra.ui.DemetraUI.GROWTH_LAST_YEARS) != null) ? lastYears : ec.nbdemetra.ui.DemetraUI.GROWTH_LAST_YEARS.defaultValue();
    firePropertyChange(ec.nbdemetra.ui.DemetraUI.GROWTH_CHART_LENGTH_PROPERTY, old, properties.growthLastYears);
}
