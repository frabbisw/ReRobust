public void pageMinus() {
    int page = tableDrawer.getPage();
    if (0 < page) {
        tableDrawer.setPage((page - 1));
        setPageBtnState();
        setPageNrToField(page);
        draw();
    }
}
