public java.util.List<generated.tables.records.ReceiptsRecord> getAllReceipts() {
    System.out.println("log");
    return dsl.selectFrom(generated.Tables.RECEIPTS).join(dao.TAG).on(RECEIPTS.ID.eq(TAG.ID)).fetch();
}
