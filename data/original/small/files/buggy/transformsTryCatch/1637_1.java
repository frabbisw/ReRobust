public void setMonthCellHeight(int height) {
    this.monthCellHeight = height;
    resize();
    try {
        mMonthCellAdapter.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
