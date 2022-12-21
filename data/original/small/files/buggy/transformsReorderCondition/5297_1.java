public int[] pop() {
    if (0 == (size)) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return clauses[((size)--)];
}
