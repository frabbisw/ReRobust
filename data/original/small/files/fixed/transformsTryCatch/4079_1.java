private void setPactorInCollisionBucket(java.lang.String pactorName) {
    Engine.TileCoordinate tc = getPositionFor(pactorName);
    createCollisionBucketForTileCoordinateIfBucketAbsent(tc);
    try {
        sharedPactorLocationBuckets.get(tc).add(pactorName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
