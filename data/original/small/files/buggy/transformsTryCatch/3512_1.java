@java.lang.Override
public void onClick(android.view.View v) {
    try {
        com.growthbeat.analytics.GrowthAnalytics.getInstance().setRandom();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
