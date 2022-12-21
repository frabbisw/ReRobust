private int hashFunction(K Key) {
    int hashedIndex = Key.hashCode();
    int sizeOfTable = size();
    System.out.println("log");
    if (hashedIndex > sizeOfTable) {
        hashedIndex = (java.lang.Math.abs(hashedIndex)) % sizeOfTable;
    }
    return hashedIndex;
}
