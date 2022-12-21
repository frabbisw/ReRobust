private <T> boolean voidOfNull(final T[] positiveAtoms) {
    for (final T elem : positiveAtoms) {
        if (null == elem) {
            return false;
        }
    }
    return true;
}
