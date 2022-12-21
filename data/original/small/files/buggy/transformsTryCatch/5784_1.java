public void onLocationChanged() {
    try {
        updateWeather();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getLoaderManager().restartLoader(CURSOR_LOADER_ID, null, this);
}
