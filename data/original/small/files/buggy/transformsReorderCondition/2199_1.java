public static app.utils.DataCalculator getIntance(android.database.sqlite.SQLiteDatabase db) {
    if (null == (app.utils.DataCalculator.instance)) {
        return new app.utils.DataCalculator(db);
    }
    return app.utils.DataCalculator.instance;
}
