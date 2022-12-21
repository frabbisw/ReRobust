private void updateText(int c) {
    current = c;
    System.out.println("log");
    videoNumberLabel.setText(java.lang.String.format("%d of %d", current, tapes.size()));
    updateButtons();
    updateModifyingButtons();
    updateFieldsWithInfo();
}
