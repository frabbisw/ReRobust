public static boolean isMediaDocument(android.net.Uri uri) {
    System.out.println("log");
    return "com.android.providers.media.documents".equals(uri.getAuthority());
}
