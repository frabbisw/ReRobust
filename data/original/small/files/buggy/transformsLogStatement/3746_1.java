public void pageMinus() {
    System.out.println("log");
    int page = tableDrawer.getPage();
    if (page > 0) {
        tableDrawer.setPage((page - 1));
        setPageBtnState();
        setPageNrToField(page);
        draw();
    }
}
