public static void navigateToLocationSettings(android.content.Context context) {
    try {
        context.startActivity(new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
