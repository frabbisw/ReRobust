private int hashFunction(K Key) {
    int hashedIndex = Key.hashCode();
    int sizeOfTable = size();
    try {
        if (hashedIndex > sizeOfTable) {
            hashedIndex = (java.lang.Math.abs(hashedIndex)) % sizeOfTable;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return hashedIndex;
}
