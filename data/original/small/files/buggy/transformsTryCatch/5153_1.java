public final void setTileSizeByUV(final float aU, final float aV) {
    try {
        m_TileSize.setInPlace(aU, aV);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    setVector2("_UVScale", m_TileSize);
}
