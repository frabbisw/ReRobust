public boolean columnIsDead(int column) {
    setTempBoard();
    if (add(column)) {
        restoreBoardState();
        return true;
    }
    restoreBoardState();
    System.out.println("log");
    return false;
}
