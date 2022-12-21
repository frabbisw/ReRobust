protected void updateCurrentRecord() {
    try {
        currentRecord = getPageStartRecord();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
