private void nextPdfPage() {
    int next = (mCurrentPage.getIndex()) + 1;
    try {
        if ((next < (getPageCount())) && (next >= 0)) {
            showPage(next);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
