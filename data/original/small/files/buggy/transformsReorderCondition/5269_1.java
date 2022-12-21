private int hashFunction(K Key) {
    int hashedIndex = Key.hashCode();
    int sizeOfTable = size();
    if (sizeOfTable < hashedIndex) {
        hashedIndex = (java.lang.Math.abs(hashedIndex)) % sizeOfTable;
    }
    return hashedIndex;
}
