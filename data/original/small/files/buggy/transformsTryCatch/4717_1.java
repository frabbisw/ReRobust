@java.lang.Override
public com.microsoft.azure.management.sql.implementation.SqlDatabaseImpl withoutElasticPool() {
    try {
        this.inner().withElasticPoolName("");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this;
}