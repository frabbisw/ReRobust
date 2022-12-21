public void setPageSize(int value) {
    pageSize = value;
    try {
        clearOfferCache();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
