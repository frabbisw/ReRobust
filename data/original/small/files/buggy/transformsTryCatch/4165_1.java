public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        openCameraForVideos(addVideo);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
