private void updateWeather() {
    try {
        com.sauken.sunshine.sync.SunshineSyncAdapter.syncImmediately(getActivity());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
