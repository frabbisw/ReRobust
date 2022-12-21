private void createSubject(java.lang.String key) {
    com.sharethrough.sdk.network.AdManager.setAdManagerInstance(adManager);
    subject = new com.sharethrough.sdk.SharethroughTest.SharethroughStub(org.robolectric.Robolectric.application, key, adCacheTimeInMilliseconds, renderer, availableCreatives, beaconService, null);
    try {
        subject.setOnStatusChangeListener(onStatusChangeListener);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
