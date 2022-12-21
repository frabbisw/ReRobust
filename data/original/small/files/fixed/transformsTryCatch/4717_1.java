@java.lang.Override
public com.microsoft.azure.management.sql.implementation.SqlDatabaseImpl withoutElasticPool() {
    try {
        this.inner().withElasticPoolName(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}
