public void setTime(int count) {
    try {
        lblTimer.setText(("" + count));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
