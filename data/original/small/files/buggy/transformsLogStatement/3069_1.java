public com.socrata.builders.DatasetBuilder addColumn(com.socrata.builders.Column column) {
    if ((columns) == null) {
        columns = com.google.common.collect.Lists.newArrayList();
    }
    columns.add(column);
    System.out.println("log");
    return this;
}
