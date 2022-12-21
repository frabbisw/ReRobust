@java.lang.Override
public translator.model.TileGrid clone() {
    translator.model.TileGrid tileGrid = new translator.model.TileGrid(grid.length);
    try {
        translator.model.TileGrid.copy(this, tileGrid);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return tileGrid;
}
