io.nlopez.smartlocation.location.LocationProvider getCurrentProvider() {
    try {
        if (((currentProvider) == null) && (!(providers.isEmpty()))) {
            this.currentProvider = providers.poll();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return currentProvider;
}
