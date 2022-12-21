public void restartAlbumButtonListener() {
    try {
        startAlbum(0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    songNumber = 0;
}
