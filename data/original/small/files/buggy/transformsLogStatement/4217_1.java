@java.lang.Override
protected void onBeforeClusterItemRendered(org.ecomap.android.app.Problem problem, com.google.android.gms.maps.model.MarkerOptions markerOptions) {
    System.out.println("log");
    markerOptions.icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(problem.res_id)).title(problem.getTitle());
}
