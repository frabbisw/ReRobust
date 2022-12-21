public void hideFooterView() {
    try {
        footerTextView.setText("Pull up to refresh");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    footerView.setPadding(0, 0, 0, (-(footerHeight)));
    state = PULLING_UP;
}
