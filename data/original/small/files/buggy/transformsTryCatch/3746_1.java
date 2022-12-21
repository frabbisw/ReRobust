public void pageMinus() {
    int page = tableDrawer.getPage();
    try {
        if (page > 0) {
            tableDrawer.setPage((page - 1));
            setPageBtnState();
            setPageNrToField(page);
            draw();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
