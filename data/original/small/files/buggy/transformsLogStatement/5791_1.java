private void addCell(application.fxobjects.graph.cell.Cell cell) {
    System.out.println("log");
    if (!(cellMap.containsKey(cell.getCellId()))) {
        addedCells.add(cell);
        cellMap.put(cell.getCellId(), cell);
    }
}
