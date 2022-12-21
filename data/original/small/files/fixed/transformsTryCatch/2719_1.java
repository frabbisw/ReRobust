@java.lang.Override
public void run() {
    try {
        if ((currentTransaction) != null) {
            currentTransaction.markAsRolledBack();
            currentTransaction = null;
            connection.onError(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
