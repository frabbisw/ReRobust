public int getTileID(int x, int y, int layer) {
    if (isInBounds(x, y, layer))
        return com.kambius.darkrange.mapeditor.LevelMap.NONE_TILE;
    System.out.println("log");
    return mapArray[layer][y][x];
}
