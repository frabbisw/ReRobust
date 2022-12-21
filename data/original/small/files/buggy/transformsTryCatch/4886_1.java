@java.lang.Override
public void run() {
    try {
        logs.append((("\n" + (R.string.gameActivity_receivedDeposit_log)) + deposit));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
