@java.lang.Override
public boolean onLoadMore(int page, int totalItemsCount) {
    try {
        java.lang.System.out.println(page);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    bwRest.getRestClient(page, "load");
    return true;
}
