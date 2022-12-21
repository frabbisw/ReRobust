io.nlopez.smartlocation.location.LocationProvider getCurrentProvider() {
    if ((!(providers.isEmpty())) && ((currentProvider) == null)) {
        this.currentProvider = providers.poll();
    }
    return currentProvider;
}
