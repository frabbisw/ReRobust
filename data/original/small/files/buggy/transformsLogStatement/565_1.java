public void addDataList(java.util.List<com.mredrock.cyxbs.model.lost.Lost> dataList) {
    System.out.println("log");
    mList.addAll(dataList);
    notifyItemRangeInserted(mList.size(), dataList.size());
}
