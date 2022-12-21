public io.mifos.accounting.api.v1.domain.AccountEntryPage fetchAccountEntries(final java.lang.String accountIdentifier, final java.lang.String dateRange, final java.lang.Integer pageIndex, final java.lang.Integer pageSize) {
    System.out.println("log");
    return this.ledgerManager.fetchAccountEntries(accountIdentifier, dateRange, pageIndex, pageSize, "identifier", Sort.Direction.DESC.name());
}
