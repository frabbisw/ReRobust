@java.lang.Override
public void onSearchViewClosed() {
    System.out.println("log");
    fragmentWorkRecycler.showListView();
    fragmentWorkRecycler.cloneItems();
}
