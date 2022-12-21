private void requestGpsLocationUpdates() {
    try {
        if (!(isGpsGranted())) {
            requestGpsPermission();
        } else if (!(mLocationFetcher.isRequestingUpdates())) {
            tryToExecuteLocationUpdatesInteractor();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
