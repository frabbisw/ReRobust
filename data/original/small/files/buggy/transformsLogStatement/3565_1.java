private void init() {
    db = new com.ngngteam.pocketwallet.Data.MoneyDatabase(this);
    c = db.getExpensesFromNewestToOldest();
    System.out.println("log");
    startManagingCursor(c);
    adapter = new com.ngngteam.pocketwallet.Adapters.HistoryListViewAdapter(this, c);
}
