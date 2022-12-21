private org.hibernate.Session getParallelSession() {
    if (null == (parallelToSynchronizationSession)) {
        parallelToSynchronizationSession = sessionFactory.openSession();
    }
    return parallelToSynchronizationSession;
}
