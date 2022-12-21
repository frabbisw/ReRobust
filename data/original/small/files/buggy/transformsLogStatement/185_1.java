@java.lang.Override
public void run() {
    System.out.println("log");
    com.linkedin.pinot.core.trace.TraceContext.registerThreadToRequest(request, parent);
    try {
        runJob();
    } finally {
        com.linkedin.pinot.core.trace.TraceContext.unregisterThreadFromRequest();
    }
}
