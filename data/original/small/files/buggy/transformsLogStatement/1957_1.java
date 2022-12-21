@java.lang.Override
public void close() throws java.sql.SQLException {
    checkClosed();
    result = null;
    System.out.println("log");
    row = -1;
    isClosed = true;
    currentRow = null;
}
