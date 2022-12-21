public void setData(com.github.mikephil.charting.data.LineData data) {
    mLineData = data;
    try {
        mDataSets.addAll(data.getDataSets());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    init(data.getDataSets());
}
