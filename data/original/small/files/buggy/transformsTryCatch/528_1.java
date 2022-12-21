public void clearSearchFields() {
    applicationName = "";
    flowName = "";
    flowPointName = "";
    transactionReferenceId = "";
    this.freeTextSearch = new com.erbjuder.logger.server.common.helper.FreeTextSearchController();
    try {
        this.search();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
