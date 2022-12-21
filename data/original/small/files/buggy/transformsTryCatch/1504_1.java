public void getByteFromPosition(byte[] dst, int k) {
    try {
        get(dst, ((((header) - k) + (capacity)) & (capacity)), dst.length);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
