@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    try {
        searchWord(query);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
