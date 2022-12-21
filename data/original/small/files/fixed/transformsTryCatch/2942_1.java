private org.hibernate.Session getParallelSession() {
    try {
        if (((parallelToSynchronizationSession) == null) && ((sessionFactory) != null)) {
            parallelToSynchronizationSession = sessionFactory.openSession();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return parallelToSynchronizationSession;
}
