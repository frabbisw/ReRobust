public void suspend() {
    try {
        if ((m_db) != null) {
            m_db.close();
            m_db = null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
