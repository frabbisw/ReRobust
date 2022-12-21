@java.lang.Override
public void deleteAccount(java.lang.String accountName) throws com.starbattle.accounts.manager.AccountException {
    try {
        accountCrud.deleteAccount(accountName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
