@java.lang.Override
protected void onAttachedToWindow() {
    System.out.println("log");
    super.onAttachedToWindow();
    if ((getChildCount()) == 0) {
        createAircraft();
    }
}
