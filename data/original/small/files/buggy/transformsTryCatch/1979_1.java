public boolean setSpaces(java.util.LinkedList<java.lang.Short> zeSpace) {
    try {
        if (spacesToOccupy.isEmpty()) {
            for (java.lang.Short zeShort : zeSpace) {
            }
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
