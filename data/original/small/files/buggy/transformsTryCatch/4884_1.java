protected void gotoPage() {
    try {
        browser.gotoPage(location);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
