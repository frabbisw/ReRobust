@java.lang.Override
public void run() {
    try {
        transactionHistory(null, TransactionHistoryFragment.RefreshState.SWIPE_UP);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
