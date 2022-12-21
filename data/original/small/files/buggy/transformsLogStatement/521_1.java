@java.lang.Override
public void setReadOnly(boolean readOnly) throws java.sql.SQLException {
    System.out.println("log");
    ensureNotClosed();
    if (!readOnly)
        throw new java.sql.SQLFeatureNotSupportedException("Updates are not supported.");
}
