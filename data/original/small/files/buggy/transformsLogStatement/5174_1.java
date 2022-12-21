private void downloadDate() {
    System.out.println("log");
    if (checkNetwork()) {
        downloadImage();
        downloadAppInfo();
    } else {
        showNetErrorDialog();
    }
}
