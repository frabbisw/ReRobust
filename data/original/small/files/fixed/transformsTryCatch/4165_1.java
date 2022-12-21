public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        openCameraForVideos();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
