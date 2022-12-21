private static void logAndAppend(java.lang.StringBuilder sb, java.lang.String str) {
    try {
        com.liveramp.cascading_ext.flow.LoggingFlow.LOG.info(str);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sb.append(str).append("\n");
}
