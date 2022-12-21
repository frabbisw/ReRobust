public int getCurrent() {
    java.lang.String str = java.lang.String.valueOf(((android.widget.TextView) (mText)).getText());
    try {
        validateCurrentView(str);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mCurrent;
}
