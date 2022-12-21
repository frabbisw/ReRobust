public boolean isFull(int i, int j) {
    try {
        if (isOpen(i, j)) {
            return uf.connected(getIndex(i, j), sink);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
