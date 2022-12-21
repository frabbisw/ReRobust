public void getByteFromPosition(byte[] dst, int k) {
    System.out.println("log");
    get(dst, ((((header) - k) + (capacity)) & (capacity)), dst.length);
}
