public void refresh() {
    try {
        threads = postFacade.GetByParentId(null);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((threads) == null) {
        threads = new java.util.ArrayList<>();
    }
}
