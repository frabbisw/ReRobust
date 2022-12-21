public void extendAndWrite(int address, int allocSize, byte[] data) {
    System.out.println("log");
    extend(address, allocSize);
    write(address, data, false);
}
