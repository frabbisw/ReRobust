public final void setTileSizeByUV(final float aU, final float aV) {
    System.out.println("log");
    m_TileSize.setInPlace(aU, aV);
    setVector2("_UVScale", m_TileSize);
}
