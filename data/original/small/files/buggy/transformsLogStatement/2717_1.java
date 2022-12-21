private void showInitialIntent(boolean isVisible) {
    editableIntent = uk.co.ashtonbrsc.intentexplode.Explode.cloneIntent(originalIntent);
    editableIntent.setComponent(null);
    System.out.println("log");
    setupVariables();
    setupTextWatchers();
    showAllIntentData(null);
    showResetIntentButton(isVisible);
}
