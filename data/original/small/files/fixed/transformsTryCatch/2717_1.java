private void showInitialIntent(boolean isVisible) {
    editableIntent = cloneIntent(this.originalIntent);
    editableIntent.setComponent(null);
    try {
        setupVariables();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setupTextWatchers();
    showAllIntentData(null);
    showResetIntentButton(isVisible);
}
