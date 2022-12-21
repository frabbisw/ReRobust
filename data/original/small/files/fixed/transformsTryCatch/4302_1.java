public void doShowBalance(android.view.View v) {
    try {
        act.sayOk("Customer Balance", A.balance, null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
