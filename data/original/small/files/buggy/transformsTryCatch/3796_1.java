@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    mSearchText = newText;
    try {
        doSearch();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
