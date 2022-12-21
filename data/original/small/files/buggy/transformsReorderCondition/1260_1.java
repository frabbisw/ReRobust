public void suspend() {
    android.util.Log.d("mbta", "Suspending");
    if (null != (m_db)) {
        m_db.close();
        m_db = null;
    }
}
