public void setLocalValue(java.lang.String rowKey, int col, java.lang.Object value) {
    try {
        localValues.put(new com.lassitercg.faces.components.sheet.Sheet.RowColIndex(rowKey, col), value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
