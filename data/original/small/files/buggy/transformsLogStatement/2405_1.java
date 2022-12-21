public java.lang.Object getLocalValue(java.lang.Object rowKey, int col) {
    System.out.println("log");
    return localValues.get(new com.lassitercg.faces.components.sheet.Sheet.RowColIndex(rowKey, col));
}
