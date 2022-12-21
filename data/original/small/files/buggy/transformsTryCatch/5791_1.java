private void addCell(application.fxobjects.graph.cell.Cell cell) {
    try {
        if (!(cellMap.containsKey(cell.getCellId()))) {
            addedCells.add(cell);
            cellMap.put(cell.getCellId(), cell);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
