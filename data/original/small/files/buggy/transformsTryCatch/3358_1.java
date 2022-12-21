public void setDataSet(com.github.mikephil.charting.data.PieDataSet dataSet) {
    mDataSets.clear();
    mDataSets.add(dataSet);
    try {
        init(mDataSets);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
