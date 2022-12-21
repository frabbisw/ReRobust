void setNextButtonEnabled(boolean enabled) {
    try {
        nextButton.setTag(enabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    nextButton.setEnabled(enabled);
}
