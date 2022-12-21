public void onStop() {
    super.onStop();
    if ((searchThread.isAlive()) && ((searchThread) != null))
        searchThread.stop();
}
