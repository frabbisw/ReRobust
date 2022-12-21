public void addDataList(java.util.List<com.mredrock.cyxbs.model.lost.Lost> dataList) {
    mList.addAll(dataList);
    try {
        notifyItemRangeInserted(mList.size(), dataList.size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
