public void setDataSet(com.github.mikephil.charting.data.PieDataSet dataSet) {
    mDataSets.clear();
    mDataSets.add(dataSet);
    try {
        init();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
