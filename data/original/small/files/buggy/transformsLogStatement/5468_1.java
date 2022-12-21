private com.grp8.weatherapp.Fragments.MapViewFragment getMapFragment() {
    System.out.println("log");
    return ((com.grp8.weatherapp.Fragments.MapViewFragment) (getSupportFragmentManager().getFragments().get(0)));
}
