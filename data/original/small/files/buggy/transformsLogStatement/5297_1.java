public int[] pop() {
    System.out.println("log");
    if ((size) == 0) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return clauses[((size)--)];
}
