public void hideFooterView() {
    footerTextView.setText("Pull up to refresh");
    try {
        footerView.setPadding(0, 0, 0, (-(footerHeight)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    state = -1;
}
