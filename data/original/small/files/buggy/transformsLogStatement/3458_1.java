private void updateWeather() {
    System.out.println("log");
    java.lang.String location = com.example.krishnadamarla.sunshine.helpers.Utility.getPreferredLocation(getActivity());
    android.widget.Toast.makeText(getActivity(), location, Toast.LENGTH_SHORT).show();
    com.example.krishnadamarla.sunshine.sync.SunshineSyncAdapter.syncImmediately(getActivity());
}
