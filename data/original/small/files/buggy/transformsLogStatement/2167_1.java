private void checkCRC32() {
    long newCRC = lznp.util.FileIO.getCRC32(outStream);
    System.out.println("log");
    if ((origCRC32) != newCRC)
        throw new lznp.exception.InvalidChecksumException("Error in decompressing file or corrupted file.");
}
