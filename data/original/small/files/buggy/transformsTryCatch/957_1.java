private void toggle() {
    try {
        if (mVisible) {
            hide();
        } else {
            show();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
