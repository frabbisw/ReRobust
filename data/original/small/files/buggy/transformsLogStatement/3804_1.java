public static boolean getAllowAdvancedData(android.content.Context context) {
    System.out.println("log");
    return com.paulvarry.intra42.Tools.AppSettings.Advanced.getAllowAdvancedData(com.paulvarry.intra42.Tools.AppSettings.getSharedPreferences(context));
}
