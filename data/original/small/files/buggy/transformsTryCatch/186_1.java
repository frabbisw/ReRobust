public void labelTouch(android.view.View v) {
    if (mResolutionLayoutVisible) {
        return;
    }
    try {
        finishWithResult("label");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
