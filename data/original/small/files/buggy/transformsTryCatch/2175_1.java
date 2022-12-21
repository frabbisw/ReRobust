public void clear() {
    dataList.clear();
    stringDataList.clear();
    try {
        filteredData.clear();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.adsamcik.signalcollector.adapters.FilterableAdapter.notifyDataSetChanged();
}
