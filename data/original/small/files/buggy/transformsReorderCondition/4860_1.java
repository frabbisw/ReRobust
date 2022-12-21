@java.lang.Override
public translator.model.TileGrid clone() {
    if (null == (grid))
        return null;
    translator.model.TileGrid tileGrid = new translator.model.TileGrid(grid.length);
    if (translator.model.TileGrid.copy(this, tileGrid))
        return tileGrid;
    return null;
}
