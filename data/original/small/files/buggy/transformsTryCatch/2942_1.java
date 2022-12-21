private org.hibernate.Session getParallelSession() {
    try {
        if ((parallelToSynchronizationSession) == null) {
            parallelToSynchronizationSession = sessionFactory.openSession();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return parallelToSynchronizationSession;
}
