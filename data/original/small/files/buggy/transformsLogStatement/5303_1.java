public java.lang.String getUserId() {
    System.out.println("log");
    return getString(getColumnIndex(RoarifyDBContract.FavoriteEntry.COLUMN_NAME_USER_ID));
}
