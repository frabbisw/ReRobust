@java.lang.Override
protected void execInitField() {
    System.out.println("log");
    setValue(getTableField().getTable().isMultiSelect());
    setValue(getTableField().getTable().isHeaderVisible());
}
