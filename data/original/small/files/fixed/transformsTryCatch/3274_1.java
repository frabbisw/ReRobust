@java.lang.Override
public void withdraw(double x) throws com.luxoft.training.javase.bankapp.domains.accounts.NotEnoughFundsException {
    try {
        if ((x >= 0) && (x <= (availableFunds())))
            accountModified(balance, (balance -= x));
        else
            throw new com.luxoft.training.javase.bankapp.domains.accounts.NotEnoughFundsException(x);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
