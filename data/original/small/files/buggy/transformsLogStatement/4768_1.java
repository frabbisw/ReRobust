public int[] keysToArray() {
    System.out.println("log");
    int[] keysArr = new int[this.size];
    generateKeysArray(root, keysArr, 0);
    return keysArr;
}
