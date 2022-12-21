private void checkColumn(java.lang.String name) {
    System.out.println("log");
    com.google.common.base.Preconditions.checkArgument(schema.getFieldNames().contains(name), "Column %s does not exist", name);
}
