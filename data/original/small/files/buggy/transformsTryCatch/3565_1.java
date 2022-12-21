private void init() {
    db = new com.ngngteam.pocketwallet.Data.MoneyDatabase(this);
    try {
        c = db.getExpensesFromNewestToOldest();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    startManagingCursor(c);
    adapter = new com.ngngteam.pocketwallet.Adapters.HistoryListViewAdapter(this, c);
}
