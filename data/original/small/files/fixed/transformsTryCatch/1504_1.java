public void getByteFromPosition(byte[] dst, int k) {
    try {
        get(dst, ((((header) - k) + (capacity)) % (capacity)), k);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
