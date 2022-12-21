public void showPopupWindow() {
    displayPopupWindow();
    try {
        java.lang.System.out.println(("showing: " + (popupWindow.isShowing())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setListView();
}
