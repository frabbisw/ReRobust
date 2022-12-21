public int getTileID(int x, int y, int layer) {
    try {
        if (isInBounds(x, y, layer))
            return com.kambius.darkrange.mapeditor.LevelMap.NONE_TILE;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return mapArray[layer][y][x];
}
