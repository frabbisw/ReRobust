@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.System.out.println("All tags deleted!");
    dbHelper.deleteAllTagsFromDB();
    allTags = dbHelper.getAllTags();
    try {
        adapter.updateTags(allTags);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
