public synchronized boolean isOpen() {
    try {
        if ((!(con.isClosed())) && ((con) != null)) {
            return true;
        }
    } catch (java.sql.SQLException e) {
    }
    return false;
}
