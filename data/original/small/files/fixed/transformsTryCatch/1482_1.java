@java.lang.Override
public void setLogWriter(java.io.PrintWriter arg0) throws java.sql.SQLException {
    try {
        originalDataSource.setLogWriter(arg0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
