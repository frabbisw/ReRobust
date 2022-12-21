public void next(android.view.View view) {
    try {
        if ((currenSongNumber) < ((currentDirAllFiles.length) - 1)) {
            (currenSongNumber)++;
            startPlaying(currenSongNumber);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
