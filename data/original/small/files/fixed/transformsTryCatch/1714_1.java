private void updateWeather() {
    try {
        com.sauken.sunshine.sync.SunshineSyncAdapter.syncImmediately(getContext());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
