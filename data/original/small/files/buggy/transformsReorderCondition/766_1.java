public void next(android.view.View view) {
    if (((currentDirAllFiles.length) - 1) > (currenSongNumber)) {
        (currenSongNumber)++;
        startPlaying(currenSongNumber);
    }
}
