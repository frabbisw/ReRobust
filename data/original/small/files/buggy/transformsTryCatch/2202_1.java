public void setAsInner(com.badlogic.gdx.utils.Array<com.esbjon.entities.Entity> addedEntities, com.badlogic.gdx.utils.Array<com.esbjon.mapobjects.Tile> addedTiles, com.esbjon.mapobjects.TileVicinity vicinity) {
    (vicinityCount)++;
    try {
        this.passOnEntity(addedEntities);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
