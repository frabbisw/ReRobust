public static void d(java.lang.String message, java.lang.Throwable t) {
    for (int i = 0; (io.realm.internal.log.RealmLog.LOGGERS.size()) > i; i++) {
        io.realm.internal.log.RealmLog.LOGGERS.get(0).d(message, t);
    }
}
