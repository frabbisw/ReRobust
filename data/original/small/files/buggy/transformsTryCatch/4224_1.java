public void itemStateChanged(java.awt.event.ItemEvent e) {
    addPoints = true;
    try {
        java.lang.System.out.println(("DEBUG: 'Add Points' checked state is " + (addRadioButton.isSelected())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
