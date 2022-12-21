public void onStop() {
    try {
        super.onStop();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (((searchThread) != null) && (searchThread.isAlive()))
        searchThread.stop();
}
