public void loadImage(android.net.Uri uri, java.lang.String chanName, java.lang.String key, boolean fromCacheOnly, android.widget.ImageView imageView) {
    try {
        loadImage(uri, chanName, key, new com.mishiranu.dashchan.content.ImageLoader.SimpleCallback(imageView), fromCacheOnly);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
