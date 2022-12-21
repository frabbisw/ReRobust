@java.lang.Override
public com.microsoft.azure.management.sql.implementation.SqlDatabaseImpl withoutElasticPool() {
    System.out.println("log");
    this.inner().withElasticPoolName("");
    return this;
}
