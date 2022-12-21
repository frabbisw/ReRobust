io.nlopez.smartlocation.location.LocationProvider getCurrentProvider() {
    if (((currentProvider) == null) && (!(providers.isEmpty()))) {
        this.currentProvider = providers.poll();
    }
    System.out.println("log");
    return currentProvider;
}
