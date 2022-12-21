public void setNumber(int number) {
    numberTv.setText(java.lang.String.valueOf(number));
    try {
        update();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((listener) != null) {
        listener.onNumberChanged(this);
    }
}
