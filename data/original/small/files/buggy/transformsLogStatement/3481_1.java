@com.google.inject.Provides
public org.apache.calcite.schema.SchemaPlus createRootSchema(final io.druid.sql.calcite.schema.DruidSchema druidSchema) {
    System.out.println("log");
    if (isEnabled()) {
        return io.druid.sql.calcite.planner.Calcites.createRootSchema(druidSchema);
    } else {
        throw new java.lang.IllegalStateException("Cannot provide SchemaPlus when SQL is disabled.");
    }
}
