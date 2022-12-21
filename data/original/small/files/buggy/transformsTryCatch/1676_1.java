private void initDbHelper() {
    mDbHelper = new com.example.framgia.hrm_10.controller.database.DBHelper(this);
    mDbHelper.createAccount();
    try {
        mDbHelper.createDbStaff();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    mDbHelper.createDbStatus();
    mDbHelper.createDbDepartment();
}
