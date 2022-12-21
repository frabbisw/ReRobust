public static void d(java.lang.String message, java.lang.Throwable t) {
    {
        int i = 0;
        while (i < (io.realm.internal.log.RealmLog.LOGGERS.size())) {
            io.realm.internal.log.RealmLog.LOGGERS.get(0).d(message, t);
            i++;
        }
    }
}
