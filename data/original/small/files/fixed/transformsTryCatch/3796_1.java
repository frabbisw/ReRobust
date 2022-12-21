@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    mSearchText = newText;
    try {
        if ((list) != null)
            doSearch();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
