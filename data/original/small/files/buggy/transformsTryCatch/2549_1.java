public static void shutdown() {
    model.DBManager.sessionFactory.close();
    try {
        model.DBManager.lock.unlock();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
