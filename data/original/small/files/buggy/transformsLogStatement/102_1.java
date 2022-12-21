@java.lang.Override
protected void updateProperties() {
    System.out.println("log");
    setEnabled(isThereAtLeastOneFeatureThatHasChildren());
    setChecked(isEveryFeatureCollapsed());
}
