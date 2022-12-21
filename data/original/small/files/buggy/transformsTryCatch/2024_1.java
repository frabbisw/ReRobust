@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        mUm = ((android.os.UserManager) (getSystemService(Context.USER_SERVICE)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mProfiles = new android.util.SparseArray<com.android.settings.accounts.AccountSettings.ProfileData>(2);
    setHasOptionsMenu(true);
}
