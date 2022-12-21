private void setListViewAdapter() {
    m_listViewAdapter = new com.asksven.betterbatterystats.StatsAdapter(this, getStatList());
    try {
        setListAdapter(m_listViewAdapter);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
