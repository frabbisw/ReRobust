public float getMapPixelWidth() {
    float mapPixelWidth = (levelScale) * ((getMapWidth()) * (getMapTileWidth()));
    return mapPixelWidth;
}
