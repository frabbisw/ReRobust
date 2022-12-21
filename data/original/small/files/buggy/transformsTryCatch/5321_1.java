@java.lang.Override
protected void execInitField() {
    setValue(getTableField().getTable().isMultiSelect());
    try {
        setValue(getTableField().getTable().isHeaderVisible());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
