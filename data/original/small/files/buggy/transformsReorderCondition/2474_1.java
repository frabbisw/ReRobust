private boolean validSite(int row, int col) {
    return (col > (n)) || (((row < 0) || (row > (n))) || (col < 0));
}
