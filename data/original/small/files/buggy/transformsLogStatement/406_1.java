@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    System.out.println("log");
    searchWord(query);
    return false;
}
