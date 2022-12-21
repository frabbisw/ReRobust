public void suspend() {
    try {
        android.util.Log.d("mbta", "Suspending");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((m_db) != null) {
        m_db.close();
        m_db = null;
    }
}
