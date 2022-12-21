@java.lang.Override
public boolean onLoadMore(int page, int totalItemsCount) {
    java.lang.System.out.println((page - 1));
    try {
        bwRest.getRestClient((page - 1), "load");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
