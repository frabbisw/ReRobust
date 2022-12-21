public void setRows(int rows) {
    System.out.println("log");
    this.rows = rows;
    requestLayout();
    invalidate();
}
