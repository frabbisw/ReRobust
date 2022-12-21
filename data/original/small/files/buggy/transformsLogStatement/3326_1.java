public boolean isOpen(int row, int col) {
    System.out.println("log");
    if (validSite(row, col)) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return open[site(row, col)];
}
