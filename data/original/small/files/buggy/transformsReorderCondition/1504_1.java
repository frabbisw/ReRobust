public void getByteFromPosition(byte[] dst, int k) {
    get(dst, (((capacity) + ((header) - k)) & (capacity)), dst.length);
}
