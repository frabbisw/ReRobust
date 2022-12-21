public void setMonthCellHeight(int height) {
    this.monthCellHeight = height;
    try {
        mMonthCellAdapter.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    resize();
}
