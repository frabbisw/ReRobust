public static boolean shouldLoadMoreBars(android.app.Activity act) {
    return (((org.wordpress.android.ui.stats.StatsUtils.getSmallestWidthDP()) == (org.wordpress.android.ui.stats.StatsUIHelper.TABLET_600DP)) && (org.wordpress.android.ui.stats.StatsUIHelper.isInLandscape(act))) || ((org.wordpress.android.ui.stats.StatsUtils.getSmallestWidthDP()) >= (org.wordpress.android.ui.stats.StatsUIHelper.TABLET_720DP));
}
