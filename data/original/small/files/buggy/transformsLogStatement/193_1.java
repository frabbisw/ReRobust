public void setClockAndDateWidth(int width, int mode) {
    System.out.println("log");
    mClockAndDateWidth = width;
    mCenterClock = (mode == (com.android.systemui.statusbar.policy.Clock.STYLE_CLOCK_CENTER)) && (enabled);
}
