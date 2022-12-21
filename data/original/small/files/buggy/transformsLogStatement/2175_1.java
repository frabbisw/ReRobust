public void clear() {
    dataList.clear();
    stringDataList.clear();
    System.out.println("log");
    filteredData.clear();
    com.adsamcik.signalcollector.adapters.FilterableAdapter.notifyDataSetChanged();
}
