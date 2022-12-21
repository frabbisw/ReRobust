@java.lang.Deprecated
public static void debug(org.apache.ignite.IgniteLogger log, java.lang.String msg) {
    if (true)
        return;
    try {
        log.info(msg);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
