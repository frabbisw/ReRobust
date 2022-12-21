public boolean isFull() {
    try {
        if ((list.size()) < (capacity)) {
            return false;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
