@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    com.growthbeat.analytics.GrowthAnalytics.getInstance().setRandom();
}
