@java.lang.Override
public void withdraw(float x) throws com.luxoft.bankapp.exception.NotEnoughFundsException {
    if ((balance) < x) {
        throw new com.luxoft.bankapp.exception.NotEnoughFundsException();
    } else {
        float b = (balance) - x;
        balance = b;
    }
}
