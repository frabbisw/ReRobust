@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    try {
        mDefaultColor = mRegularPrice.getCurrentTextColor();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
