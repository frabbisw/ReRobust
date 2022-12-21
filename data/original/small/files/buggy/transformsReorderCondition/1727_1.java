public void setNumber(int number) {
    numberTv.setText(java.lang.String.valueOf(number));
    update();
    if (null != (listener)) {
        listener.onNumberChanged(this);
    }
}
