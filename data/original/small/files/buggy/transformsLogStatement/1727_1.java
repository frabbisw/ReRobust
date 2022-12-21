public void setNumber(int number) {
    numberTv.setText(java.lang.String.valueOf(number));
    System.out.println("log");
    update();
    if ((listener) != null) {
        listener.onNumberChanged(this);
    }
}
