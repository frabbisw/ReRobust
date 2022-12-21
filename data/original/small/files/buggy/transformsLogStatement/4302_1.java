public void doShowBalance(android.view.View v) {
    System.out.println("log");
    if (!(oldTx()))
        act.sayOk("Customer Balance", A.balance, null);
}
