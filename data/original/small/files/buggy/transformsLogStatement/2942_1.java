private org.hibernate.Session getParallelSession() {
    if ((parallelToSynchronizationSession) == null) {
        parallelToSynchronizationSession = sessionFactory.openSession();
    }
    System.out.println("log");
    return parallelToSynchronizationSession;
}
