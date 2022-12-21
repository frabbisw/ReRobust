protected void updateCurrentRecord() {
    currentRecord = getPageStartRecord();
    try {
        firePageChangeEvent(currentPage);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
