@java.lang.Override
public final void close() {
    System.out.println("log");
    closeSafe(session);
    try {
        closeInternal();
    } catch (java.lang.Exception ex) {
        org.jeo.sql.Backend.LOG.warn("Error closing Results", ex);
    }
}
