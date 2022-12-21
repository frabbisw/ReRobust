public static void shutdown() {
    try {
        model.DBManager.lock.unlock();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
