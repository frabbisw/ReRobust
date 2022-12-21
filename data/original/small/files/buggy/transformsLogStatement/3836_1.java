private void checkIndexBoundsForNewElements(int index) {
    System.out.println("log");
    if ((index >= 0) && (index <= (size))) {
        return;
    } else {
        throw new java.lang.IndexOutOfBoundsException();
    }
}
