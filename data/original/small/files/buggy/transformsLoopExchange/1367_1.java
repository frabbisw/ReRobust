void updatePageNumber() {
    for (; ((pageNumber) * (pageLength)) >= (pagedDataProvider.getBackendSize()); ) {
        --(pageNumber);
    }
}
