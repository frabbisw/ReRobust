public boolean columnIsDead(int column) {
    try {
        setTempBoard();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((add(column)) == 1) {
        restoreBoardState();
        return true;
    }
    restoreBoardState();
    return false;
}
