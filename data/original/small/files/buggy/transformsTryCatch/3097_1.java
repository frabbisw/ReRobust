public void setCacheable(java.lang.Integer _seconds) {
    int seconds = 172800;
    try {
        if (_seconds != null) {
            seconds = _seconds.intValue();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    java.lang.String cacheControl = ("max-age=" + 172800) + ", public, must-revalidate";
    addHeader("Cache-Control", cacheControl);
}
