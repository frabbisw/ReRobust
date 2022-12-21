public void refresh() {
    threads = postFacade.GetByParentId(null);
    if (null == (threads)) {
        threads = new java.util.ArrayList<>();
    }
}
