public int[] keysToArray() {
    int[] keysArr = new int[this.size];
    try {
        generateKeysArray(root, keysArr, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return keysArr;
}
