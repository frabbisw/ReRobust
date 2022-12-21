private void showInitialIntent(boolean isVisible) {
    editableIntent = uk.co.ashtonbrsc.intentexplode.Explode.cloneIntent(originalIntent);
    try {
        editableIntent.setComponent(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setupVariables();
    setupTextWatchers();
    showAllIntentData(null);
    showResetIntentButton(isVisible);
}
