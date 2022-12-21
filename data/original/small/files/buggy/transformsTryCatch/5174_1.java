private void downloadDate() {
    try {
        if (checkNetwork()) {
            downloadImage();
            downloadAppInfo();
        } else {
            showNetErrorDialog();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
