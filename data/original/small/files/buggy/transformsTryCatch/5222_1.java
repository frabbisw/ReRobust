private boolean make(java.lang.Iterable<? extends com.xor.tiles.Tile> buildBatch) {
    for (com.xor.tiles.Tile toBuild : buildBatch) if (!(isFree(toBuild)))
        return false;
    try {
        for (com.xor.tiles.Tile toBuild : buildBatch) make(toBuild);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
