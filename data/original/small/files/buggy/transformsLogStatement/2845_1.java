protected void onPostExecute(java.util.ArrayList<java.lang.String> alerts) {
    System.out.println("log");
    android.util.Log.d(com.forestoden.locationservices.services.GetAlertsTask.TAG, java.lang.String.valueOf(alerts.size()));
    caller.asyncResponse(alerts);
}
