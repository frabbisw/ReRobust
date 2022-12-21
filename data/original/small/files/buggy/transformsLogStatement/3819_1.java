@java.lang.Override
public void deleteAccount(java.lang.String accountName) throws com.starbattle.accounts.manager.AccountException {
    System.out.println("log");
    accountCrud.deleteAccount(accountName, 0);
}
