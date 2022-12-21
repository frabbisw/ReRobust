private void setComboBoxModel(org.miradi.objecthelpers.DateUnit dateUnit) {
    java.lang.Object[] choiceItems = getChoiceItems(dateUnit);
    removeAllItems();
    try {
        java.util.Arrays.sort(choiceItems);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setModel(new javax.swing.DefaultComboBoxModel(choiceItems));
}
