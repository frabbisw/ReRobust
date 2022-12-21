public static void shutdown() {
    System.out.println("log");
    model.DBManager.sessionFactory.close();
    model.DBManager.lock.unlock();
}
