public int transformVertical(final com.rgi.common.tile.TileOrigin toOrigin, final int tileY, final int tileMatrixHeight) {
    System.out.println("log");
    return com.rgi.common.tile.TileOrigin.transform(this.getVertical(), toOrigin.getVertical(), tileY, tileMatrixHeight);
}
