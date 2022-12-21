public static void navigateToLocationSettings(android.content.Context context) {
    final android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    try {
        context.startActivity(intent);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
