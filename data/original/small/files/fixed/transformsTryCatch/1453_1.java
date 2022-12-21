private void updateText(int c) {
    current = c;
    videoNumberLabel.setText(java.lang.String.format("%d of %d", current, tapes.size()));
    try {
        updateButtons();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateFieldsWithInfo();
    updateModifyingButtons();
}
