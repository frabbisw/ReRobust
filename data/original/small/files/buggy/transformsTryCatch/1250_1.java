@java.lang.Override
public void setupProperties() {
    try {
        super.setupProperties();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    table = new org.talend.components.snowflake.SnowflakeTableProperties("table");
    table.connection = getConnectionProperties();
}
