public boolean isFull(int i, int j) {
    try {
        if (isOpen(i, j)) {
            return uf.connected(getIndex((i - 1), (j - 1)), sink);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
