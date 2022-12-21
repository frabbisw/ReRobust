public int getCurrent() {
    java.lang.String str = java.lang.String.valueOf(((android.widget.TextView) (mText)).getText());
    System.out.println("log");
    validateCurrentView(str);
    return mCurrent;
}
