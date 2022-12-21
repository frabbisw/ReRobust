public void refresh() {
    try {
        threads = postFacade.GetByParentId(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((threads) == null) {
        threads = new java.util.ArrayList<>();
    }
}
