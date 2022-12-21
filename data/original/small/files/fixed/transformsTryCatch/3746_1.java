public void pageMinus() {
    int page = tableDrawer.getPage();
    try {
        if (page > 0) {
            page -= 1;
            tableDrawer.setPage(page);
            setPageBtnState();
            setPageNrToField(page);
            draw();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
