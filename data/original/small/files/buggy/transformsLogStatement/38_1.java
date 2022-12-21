private void setComboBoxModel(org.miradi.objecthelpers.DateUnit dateUnit) {
    java.lang.Object[] choiceItems = getChoiceItems(dateUnit);
    removeAllItems();
    java.util.Arrays.sort(choiceItems);
    System.out.println("log");
    setModel(new javax.swing.DefaultComboBoxModel(choiceItems));
}
