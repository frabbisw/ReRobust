fit.Parse secondLastRow(fit.Parse lastRow) {
    fit.Parse nextRow = table.parts;
    fit.Parse currentRow = null;
    while (lastRow != nextRow) {
        currentRow = nextRow;
        nextRow = nextRow.more;
    }
    currentRow.more = null;
    return currentRow;
}
