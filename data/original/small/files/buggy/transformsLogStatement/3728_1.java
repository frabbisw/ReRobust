private void createSubject(java.lang.String key) {
    System.out.println("log");
    com.sharethrough.sdk.network.AdManager.setAdManagerInstance(adManager);
    subject = new com.sharethrough.sdk.SharethroughTest.SharethroughStub(org.robolectric.Robolectric.application, key, adCacheTimeInMilliseconds, renderer, availableCreatives, beaconService, null);
    subject.setOnStatusChangeListener(onStatusChangeListener);
}
