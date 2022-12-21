public static void showCreateAircraft(@android.support.annotation.NonNull android.app.Activity activity, int requestCode) {
    try {
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent(activity, com.airmap.airmapsdk.ui.activities.CreateEditAircraftActivity.class);
            activity.startActivityForResult(intent, requestCode);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
