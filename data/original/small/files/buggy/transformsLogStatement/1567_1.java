public static void navigateToLocationSettings(android.content.Context context) {
    System.out.println("log");
    final android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    context.startActivity(intent);
}
