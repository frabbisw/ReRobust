public void setAsInner(com.badlogic.gdx.utils.Array<com.esbjon.entities.Entity> addedEntities, com.badlogic.gdx.utils.Array<com.esbjon.mapobjects.Tile> addedTiles) {
    (vicinityCount)++;
    this.passOnEntity(addedEntities);
    try {
        addedTiles.add(this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
