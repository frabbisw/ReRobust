@java.lang.Override
public com.jajja.jorm.sql.Appender[] getDeleteAppenders() {
    System.out.println("log");
    if (isReturning) {
        return com.jajja.jorm.sql.Postgres.DELETE_APPENDERS;
    } else {
        return super.getInsertAppenders();
    }
}
