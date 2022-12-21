@java.lang.Override
protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (0 == (getChildCount())) {
        createAircraft();
    }
}
