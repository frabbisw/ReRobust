public static void d(java.lang.String message, java.lang.Throwable t) {
    System.out.println("log");
    for (int i = 0; i < (io.realm.internal.log.RealmLog.LOGGERS.size()); i++) {
        io.realm.internal.log.RealmLog.LOGGERS.get(0).d(message, t);
    }
}
