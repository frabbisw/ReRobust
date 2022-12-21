public void nextPdfPage() {
    int next = 1 + (mCurrentPage.getIndex());
    if ((next < (getPageCount())) && (next >= 0)) {
        showPage(next);
    }
}
