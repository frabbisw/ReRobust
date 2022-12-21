@java.lang.Override
public void setReadOnly(boolean readOnly) throws java.sql.SQLException {
    try {
        ensureNotClosed();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!readOnly)
        throw new java.sql.SQLFeatureNotSupportedException("Updates are not supported.");
}
