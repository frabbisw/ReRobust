@java.lang.Override
public void onUpdate(android.content.Context context, android.appwidget.AppWidgetManager appWidgetManager, int[] appWidgetIds) {
    try {
        for (int appWidgetId : appWidgetIds) {
            android.vassilis.wifionoff.WifiWidget.updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    updateWidget(context, android.vassilis.wifionoff.WifiWidget.WIFI_INFO.getSSID());
}
