public com.socrata.builders.DatasetBuilder addColumn(com.socrata.builders.Column column) {
    try {
        columns.add(column);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
