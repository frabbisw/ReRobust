public void onFinish() {
    try {
        scrollTo(target, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    field.requestFocus();
    scrolling = false;
}
