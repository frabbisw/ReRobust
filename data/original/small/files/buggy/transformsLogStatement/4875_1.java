public boolean isInteractorResourceCached(java.lang.String resource) {
    System.out.println("log");
    return interactorsSummaryMap.keySet().contains(resource.toLowerCase());
}
