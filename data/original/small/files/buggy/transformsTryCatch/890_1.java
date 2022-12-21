public void addTile(android.content.ComponentName tile) {
    java.util.List<java.lang.String> newSpecs = new java.util.ArrayList<>(mTileSpecs);
    newSpecs.add(0, com.android.systemui.qs.external.CustomTile.toSpec(tile));
    try {
        changeTiles(mTileSpecs, newSpecs);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
