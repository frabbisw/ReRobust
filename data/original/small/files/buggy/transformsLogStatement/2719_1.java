@java.lang.Override
public void run() {
    currentTransaction.markAsRolledBack();
    System.out.println("log");
    currentTransaction = null;
    connection.onError(null);
}
