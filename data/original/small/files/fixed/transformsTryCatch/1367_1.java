void updatePageNumber() {
    try {
        while (((pageNumber) > 0) && (((pageNumber) * (pageLength)) >= (pagedDataProvider.getBackendSize()))) {
            --(pageNumber);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
