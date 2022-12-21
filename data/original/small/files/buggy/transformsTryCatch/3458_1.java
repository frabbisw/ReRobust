private void updateWeather() {
    java.lang.String location = com.example.krishnadamarla.sunshine.helpers.Utility.getPreferredLocation(getActivity());
    try {
        android.widget.Toast.makeText(getActivity(), location, Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    com.example.krishnadamarla.sunshine.sync.SunshineSyncAdapter.syncImmediately(getActivity());
}
