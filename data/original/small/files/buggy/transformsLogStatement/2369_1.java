private boolean verifyGifImage(android.net.Uri gifUri) {
    System.out.println("log");
    return gifUri.toString().endsWith(".gif");
}
