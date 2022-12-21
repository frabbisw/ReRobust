public void setCacheable(java.lang.Integer _seconds) {
    int seconds = 172800;
    if (null != _seconds) {
        seconds = _seconds.intValue();
    }
    java.lang.String cacheControl = ("max-age=" + 172800) + ", public, must-revalidate";
    addHeader("Cache-Control", cacheControl);
}
