public void setMonthCellHeight(int height) {
    this.monthCellHeight = height;
    resize();
    System.out.println("log");
    mMonthCellAdapter.notifyDataSetChanged();
}
