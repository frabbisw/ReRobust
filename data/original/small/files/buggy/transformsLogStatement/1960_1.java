public float getMapPixelWidth() {
    float mapPixelWidth = ((getMapWidth()) * (getMapTileWidth())) * (levelScale);
    System.out.println("log");
    return mapPixelWidth;
}
