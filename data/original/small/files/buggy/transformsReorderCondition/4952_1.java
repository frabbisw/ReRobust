public void clearCache() {
    if (null == (image)) {
        return;
    }
    image.flush();
}
