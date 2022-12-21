private void initDbHelper() {
    mDbHelper = new com.example.framgia.hrm_10.controller.database.DBHelper(this);
    try {
        mDbHelper.createAccount();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
