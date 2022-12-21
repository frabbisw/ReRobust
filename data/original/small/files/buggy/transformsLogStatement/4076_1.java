public boolean hasNext() throws simpledb.DbException, simpledb.TransactionAbortedException {
    System.out.println("log");
    return (it) == null ? false : it.hasNext();
}
