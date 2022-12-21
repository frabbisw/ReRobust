@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    this.db = db;
    tdd.tracker.hobby.hobbytrackerincremental.database.TableManager tableAdmin = tdd.tracker.hobby.hobbytrackerincremental.database.TableManager.getInstance();
    try {
        for (tdd.tracker.hobby.hobbytrackerincremental.database.Table t : tableAdmin.getTables()) t.createTable(db);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
