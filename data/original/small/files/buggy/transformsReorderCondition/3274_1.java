@java.lang.Override
public void withdraw(double x) throws com.luxoft.training.javase.bankapp.domains.accounts.NotEnoughFundsException {
    if ((x <= (availableFunds())) && (x > 0))
        accountModified(balance, (balance -= x));
    else
        throw new com.luxoft.training.javase.bankapp.domains.accounts.NotEnoughFundsException(x);
}
