public void setRows(int rows) {
    this.rows = rows;
    try {
        requestLayout();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    invalidate();
}
