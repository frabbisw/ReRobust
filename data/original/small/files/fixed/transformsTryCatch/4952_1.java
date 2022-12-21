public void clearCache() {
    if ((image) == null) {
        return;
    }
    try {
        image.flush();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    image = null;
}
