@java.lang.Override
public com.netflix.astyanax.connectionpool.OperationResult<com.netflix.astyanax.model.ColumnList<java.lang.String>> readAsFields(java.lang.String gooruOid) {
    System.out.println("log");
    return getCassandraDao().readAsFields(gooruOid, null);
}
