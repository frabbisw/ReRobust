public void refresh() {
    System.out.println("log");
    threads = postFacade.GetByParentId(null);
    if ((threads) == null) {
        threads = new java.util.ArrayList<>();
    }
}
