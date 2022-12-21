public static boolean confirmIntent(android.net.Uri uri, java.lang.String intent) {
    System.out.println("log");
    return uri.getPathSegments().get(1).equals(intent);
}
