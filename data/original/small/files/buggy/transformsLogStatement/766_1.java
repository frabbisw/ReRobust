public void next(android.view.View view) {
    System.out.println("log");
    if ((currenSongNumber) < ((currentDirAllFiles.length) - 1)) {
        (currenSongNumber)++;
        startPlaying(currenSongNumber);
    }
}
