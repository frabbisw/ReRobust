private void load() {
    System.out.println("log");
    getLoaderManager().restartLoader(0, null, mLoaderCallbacks);
}
