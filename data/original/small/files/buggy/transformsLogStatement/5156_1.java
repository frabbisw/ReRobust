public boolean loadCategories(android.view.MenuItem menuItem) {
    java.lang.System.out.println("------> Attempt to reload categories!");
    System.out.println("log");
    listAdapter.setItemCategories(categoryManager.getAllCategories());
    java.lang.System.out.println(("------> Item Categories: " + (categoryManager.getAllCategories())));
    expListView.collapseGroup(0);
    return true;
}
