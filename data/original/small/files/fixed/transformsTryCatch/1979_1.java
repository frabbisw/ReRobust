public boolean setSpaces(java.util.LinkedList<java.lang.Short> zeSpace) {
    try {
        if (spacesToOccupy.isEmpty()) {
            for (java.lang.Short zeShort : zeSpace) {
                spacesToOccupy.add(zeShort);
            }
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
