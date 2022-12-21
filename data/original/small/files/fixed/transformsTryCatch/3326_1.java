public boolean isOpen(int row, int col) {
    try {
        if (!(validSite(row, col))) {
            throw new java.lang.IndexOutOfBoundsException();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return open[site(row, col)];
}
