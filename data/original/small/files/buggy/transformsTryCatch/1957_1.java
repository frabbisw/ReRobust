@java.lang.Override
public void close() throws java.sql.SQLException {
    try {
        checkClosed();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    result = null;
    row = -1;
    isClosed = true;
    currentRow = null;
}
