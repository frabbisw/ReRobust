private void requestGpsLocationUpdates() {
    try {
        if (!(mLocationFetcher.isRequestingUpdates())) {
            tryToExecuteLocationUpdatesInteractor();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
