public void extendAndWrite(int address, int allocSize, byte[] data) {
    try {
        extend(address, allocSize);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    write(address, data, false);
}
