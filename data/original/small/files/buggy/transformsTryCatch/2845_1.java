protected void onPostExecute(java.util.ArrayList<java.lang.String> alerts) {
    try {
        android.util.Log.d(com.forestoden.locationservices.services.GetAlertsTask.TAG, java.lang.String.valueOf(alerts.size()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    caller.asyncResponse(alerts);
}
