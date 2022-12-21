@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    try {
        if ((getChildCount()) == 0) {
            createAircraft();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
