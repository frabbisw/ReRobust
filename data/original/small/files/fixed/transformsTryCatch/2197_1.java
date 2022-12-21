public void onFinish() {
    scrollTo(0, 0);
    try {
        field.requestFocus();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    scrolling = false;
}
