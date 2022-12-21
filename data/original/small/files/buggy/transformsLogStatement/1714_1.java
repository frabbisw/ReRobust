private void updateWeather() {
    System.out.println("log");
    com.sauken.sunshine.sync.SunshineSyncAdapter.syncImmediately(getActivity());
}
