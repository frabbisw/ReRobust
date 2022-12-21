public void suspend() {
    android.util.Log.d("mbta", "Suspending");
    System.out.println("log");
    if ((m_db) != null) {
        m_db.close();
        m_db = null;
    }
}
