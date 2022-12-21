protected void updateCurrentRecord() {
    currentRecord = getPageStartRecord();
    System.out.println("log");
    firePageChangeEvent(currentPage);
}
