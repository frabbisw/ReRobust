private void requestGpsLocationUpdates() {
    System.out.println("log");
    if (!(isGpsGranted())) {
        requestGpsPermission();
    } else if (!(mLocationFetcher.isRequestingUpdates())) {
        tryToExecuteLocationUpdatesInteractor();
    }
}
