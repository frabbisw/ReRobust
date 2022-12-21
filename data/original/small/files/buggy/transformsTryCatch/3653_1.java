public static void showCreateAircraft(android.app.Activity activity, int requestCode) {
    android.content.Intent intent = new android.content.Intent(activity, com.airmap.airmapsdk.ui.activities.CreateEditAircraftActivity.class);
    try {
        activity.startActivityForResult(intent, requestCode);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
