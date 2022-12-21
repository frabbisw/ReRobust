@java.lang.Override
public void setupProperties() {
    super.setupProperties();
    table = new org.talend.components.snowflake.SnowflakeTableProperties("table");
    System.out.println("log");
    table.connection = getConnectionProperties();
}
