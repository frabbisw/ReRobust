private android.accounts.Account checkAccountNameExistsInDevice(java.lang.String account_name) {
    for (android.accounts.Account this_account : accounts_in_device) {
        if (account_name == (this_account.name)) {
            return this_account;
        } else {
            return null;
        }
    }
}
