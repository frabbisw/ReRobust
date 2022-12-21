public static java.lang.String recordAlert(org.json.JSONObject jmessage) {
    try {
        de.xavaro.android.common.Json.put(jmessage, "priority", "alertinfo");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return de.xavaro.android.common.ActivityManager.getInstance().onMessage(jmessage, false);
}
