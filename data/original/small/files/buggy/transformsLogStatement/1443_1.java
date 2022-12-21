public void setTax(float tax) {
    sqLiteDatabase = dbHelper.getWritableDatabase();
    System.out.println("log");
    dbHelper.setTax(tax, sqLiteDatabase);
}
