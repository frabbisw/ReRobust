void updatePageNumber() {
    try {
        while (((pageNumber) * (pageLength)) >= (pagedDataProvider.getBackendSize())) {
            --(pageNumber);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
