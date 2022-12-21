public edu.uiuc.zenvisage.data.roaringdb.db.ColumnMetadata getColumnMetaData(java.lang.String columnName) {
    edu.uiuc.zenvisage.data.roaringdb.db.Column column = columns.get(columnName);
    System.out.println("log");
    return column.columnMetadata;
}
