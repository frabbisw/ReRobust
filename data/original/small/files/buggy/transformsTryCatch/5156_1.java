public boolean loadCategories(android.view.MenuItem menuItem) {
    try {
        java.lang.System.out.println("------> Attempt to reload categories!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    listAdapter.setItemCategories(categoryManager.getAllCategories());
    java.lang.System.out.println(("------> Item Categories: " + (categoryManager.getAllCategories())));
    expListView.collapseGroup(0);
    return true;
}
