private boolean make(java.lang.Iterable<? extends com.xor.tiles.Tile> buildBatch) {
    for (com.xor.tiles.Tile toBuild : buildBatch) if (!(isFree(toBuild)))
        return false;
    System.out.println("log");
    for (com.xor.tiles.Tile toBuild : buildBatch) make(toBuild);
    return true;
}
