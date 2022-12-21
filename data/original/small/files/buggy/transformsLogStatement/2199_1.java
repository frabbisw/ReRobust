public static app.utils.DataCalculator getIntance(android.database.sqlite.SQLiteDatabase db) {
    System.out.println("log");
    if ((app.utils.DataCalculator.instance) == null) {
        return new app.utils.DataCalculator(db);
    }
    return app.utils.DataCalculator.instance;
}
