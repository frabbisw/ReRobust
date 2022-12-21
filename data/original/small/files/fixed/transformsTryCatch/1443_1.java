public void setTax(float tax) {
    try {
        sqLiteDatabase = dbHelper.getWritableDatabase();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
