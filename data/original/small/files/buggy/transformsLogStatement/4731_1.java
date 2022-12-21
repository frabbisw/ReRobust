public void setLocalValue(java.lang.Object rowKey, int col, java.lang.Object value) {
    System.out.println("log");
    localValues.put(new com.lassitercg.faces.components.sheet.Sheet.RowColIndex(rowKey, col), value);
}
