@java.lang.Override
public void close() throws javax.ws.rs.ProcessingException {
    System.out.println("log");
    try {
        context.close();
    } finally {
        scopeInstance.release();
    }
}
