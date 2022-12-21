public void setNextButtonEnabled(boolean enabled) {
    try {
        nextButton.setEnabled(enabled);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
