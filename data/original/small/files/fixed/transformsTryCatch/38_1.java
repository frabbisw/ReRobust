private void setComboBoxModel(org.miradi.objecthelpers.DateUnit dateUnit) {
    java.lang.Object[] choiceItems = getChoiceItems(dateUnit);
    try {
        removeAllItems();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setModel(new javax.swing.DefaultComboBoxModel(choiceItems));
}
