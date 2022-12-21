public synchronized boolean isOpen() {
    System.out.println("log");
    try {
        if (((con) != null) && (!(con.isClosed()))) {
            return true;
        }
    } catch (java.sql.SQLException e) {
    }
    return false;
}
