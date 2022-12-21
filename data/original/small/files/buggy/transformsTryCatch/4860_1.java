@java.lang.Override
public translator.model.TileGrid clone() {
    if ((grid) == null)
        return null;
    translator.model.TileGrid tileGrid = new translator.model.TileGrid(grid.length);
    try {
        if (translator.model.TileGrid.copy(this, tileGrid))
            return tileGrid;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return null;
}
