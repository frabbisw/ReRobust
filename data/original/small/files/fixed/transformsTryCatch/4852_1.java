public static void d(java.lang.String message, java.lang.Throwable t) {
    try {
        for (int i = 0; i < (io.realm.internal.log.RealmLog.LOGGERS.size()); i++) {
            io.realm.internal.log.RealmLog.LOGGERS.get(i).d(message, t);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}