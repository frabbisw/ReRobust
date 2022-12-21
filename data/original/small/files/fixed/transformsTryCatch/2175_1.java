public void clear() {
    dataList.clear();
    stringDataList.clear();
    if ((filteredData) != null)
        filteredData.clear();
    try {
        com.adsamcik.signalcollector.adapters.FilterableAdapter.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
