public void setPageSize(int value) {
    try {
        clearOfferCache();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    pageSize = value;
}
