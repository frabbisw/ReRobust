void updatePageNumber() {
    while ((pagedDataProvider.getBackendSize()) <= ((pageNumber) * (pageLength))) {
        --(pageNumber);
    }
}
