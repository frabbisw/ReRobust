@java.lang.Override
public com.jajja.jorm.sql.Appender[] getDeleteAppenders() {
    try {
        if (isReturning) {
            return com.jajja.jorm.sql.Postgres.DELETE_APPENDERS;
        } else {
            return super.getDeleteAppenders();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
