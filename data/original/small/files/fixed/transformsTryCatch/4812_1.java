@java.lang.Override
public void onClick(android.view.View view) {
    dbHelper.deleteAllTagsFromDB();
    try {
        allTags = dbHelper.getAllTags();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    adapter.updateTags(allTags);
}
