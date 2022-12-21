@java.lang.Override
public void run() {
    currentTransaction.markAsRolledBack();
    currentTransaction = null;
    try {
        connection.onError(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
