public void setData(com.github.mikephil.charting.data.LineData data) {
    mLineData = data;
    mDataSets.addAll(data.getDataSets());
    System.out.println("log");
    init(data.getDataSets());
}
