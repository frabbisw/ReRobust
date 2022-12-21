public void setStartDateMonth(int startDateMonth) {
    this.startDateMonth = startDateMonth;
    try {
        updateMultiDate();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
