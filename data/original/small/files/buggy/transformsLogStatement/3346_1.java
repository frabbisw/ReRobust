public java.lang.String getSubmittedValue(java.lang.Object rowKey, int col) {
    System.out.println("log");
    return submittedValues.get(new com.lassitercg.faces.components.sheet.Sheet.RowColIndex(rowKey, col));
}
