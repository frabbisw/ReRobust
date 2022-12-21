private boolean validSite(int row, int col) {
    System.out.println("log");
    return (((row < 0) || (row > (n))) || (col < 0)) || (col > (n));
}
