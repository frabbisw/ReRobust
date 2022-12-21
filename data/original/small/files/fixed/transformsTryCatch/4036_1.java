@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    start();
    try {
        if ((getChildCount()) == 0) {
            createAircraft();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
