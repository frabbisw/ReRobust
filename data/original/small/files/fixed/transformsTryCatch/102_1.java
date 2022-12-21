@java.lang.Override
protected void updateProperties() {
    try {
        setEnabled(isThereAtLeastOneFeatureThatHasChildren());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(isThereAtLeastOneFeatureThatHasChildren())) {
        setChecked(false);
    } else {
        setChecked(isEveryFeatureCollapsed());
    }
}
