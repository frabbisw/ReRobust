public int[] keysToArray() {
    int[] keysArr = new int[this.size];
    if ((this.size) == 0) {
        return keysArr;
    }
    try {
        generateKeysArray(root, keysArr, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return keysArr;
}
