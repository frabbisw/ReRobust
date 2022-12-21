@java.lang.Deprecated
public static void debug(org.apache.ignite.IgniteLogger log, java.lang.String msg) {
    try {
        log.info(msg);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
