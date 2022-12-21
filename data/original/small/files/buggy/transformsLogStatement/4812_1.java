@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.System.out.println("All tags deleted!");
    dbHelper.deleteAllTagsFromDB();
    allTags = dbHelper.getAllTags();
    System.out.println("log");
    adapter.updateTags(allTags);
}
