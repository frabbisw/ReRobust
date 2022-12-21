public void addToWindow() {
    System.out.println("log");
    if (!(mPreferences.getBoolean(SettingsFragment.KEY_FLOAT_VIEW_TOGGLE, true)))
        return;
    mWindowManager.addView(this, mParams);
}
