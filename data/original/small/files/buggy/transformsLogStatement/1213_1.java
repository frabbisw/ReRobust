public void nextPdfPage() {
    System.out.println("log");
    int next = (mCurrentPage.getIndex()) + 1;
    if ((next < (getPageCount())) && (next >= 0)) {
        showPage(next);
    }
}
