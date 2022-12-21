@java.lang.Override
protected void updateProperties() {
    try {
        setEnabled(isThereAtLeastOneFeatureThatHasChildren());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setChecked(isEveryFeatureCollapsed());
}
