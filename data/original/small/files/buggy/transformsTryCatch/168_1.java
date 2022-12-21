private void load() {
    try {
        getLoaderManager().restartLoader(0, null, mLoaderCallbacks);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
