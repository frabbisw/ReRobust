public void onLocationChanged() {
    updateWeather();
    System.out.println("log");
    getLoaderManager().restartLoader(CURSOR_LOADER_ID, null, this);
}
