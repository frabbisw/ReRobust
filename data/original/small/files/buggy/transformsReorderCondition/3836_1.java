private void checkIndexBoundsForNewElements(int index) {
    if ((index <= (size)) && (index >= 0)) {
        return;
    } else {
        throw new java.lang.IndexOutOfBoundsException();
    }
}
