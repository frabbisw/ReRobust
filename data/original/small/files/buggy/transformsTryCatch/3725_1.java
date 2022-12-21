public synchronized void reportError(java.lang.Throwable t) {
    try {
        reportNote(t.getMessage());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    m_loadFailure = true;
    stop();
}
