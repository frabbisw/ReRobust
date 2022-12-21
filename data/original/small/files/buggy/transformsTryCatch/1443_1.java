public void setTax(float tax) {
    sqLiteDatabase = dbHelper.getWritableDatabase();
    try {
        dbHelper.setTax(tax, sqLiteDatabase);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
