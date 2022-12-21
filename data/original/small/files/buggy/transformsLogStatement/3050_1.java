private void setListViewAdapter() {
    System.out.println("log");
    m_listViewAdapter = new com.asksven.betterbatterystats.StatsAdapter(this, getStatList());
    setListAdapter(m_listViewAdapter);
}
