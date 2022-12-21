public boolean isFull() {
    try {
        if ((list.size()) != ((capacity) - 1)) {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
