public boolean emptyUnitBoard() {
    try {
        unitBoard.removeAll();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
