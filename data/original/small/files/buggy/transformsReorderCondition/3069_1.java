public com.socrata.builders.DatasetBuilder addColumn(com.socrata.builders.Column column) {
    if (null == (columns)) {
        columns = com.google.common.collect.Lists.newArrayList();
    }
    columns.add(column);
    return this;
}
