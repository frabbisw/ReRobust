public void setData(com.github.mikephil.charting.data.LineData data) {
    mLineData = data;
    mDataSets.addAll(data.getDataSets());
    try {
        init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
