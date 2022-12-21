@java.lang.Override
public void onSearchViewClosed() {
    fragmentWorkRecycler.showListView();
    try {
        fragmentWorkRecycler.cloneItems();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
