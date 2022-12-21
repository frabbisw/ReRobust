public void onStop() {
    System.out.println("log");
    super.onStop();
    if (((searchThread) != null) && (searchThread.isAlive()))
        searchThread.stop();
}
