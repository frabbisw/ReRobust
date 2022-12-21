io.nlopez.smartlocation.location.LocationProvider getCurrentProvider() {
    try {
        if (((currentProvider) == null) && (!(providers.isEmpty()))) {
            currentProvider = providers.poll();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return currentProvider;
}
