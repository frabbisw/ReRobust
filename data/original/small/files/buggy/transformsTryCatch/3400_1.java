public void addToWindow() {
    if (!(mPreferences.getBoolean(SettingsFragment.KEY_FLOAT_VIEW_TOGGLE, true)))
        return;
    try {
        mWindowManager.addView(this, mParams);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
