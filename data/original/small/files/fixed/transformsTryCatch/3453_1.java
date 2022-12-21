public void showPopupWindow() {
    displayPopupWindow();
    try {
        setListView();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
