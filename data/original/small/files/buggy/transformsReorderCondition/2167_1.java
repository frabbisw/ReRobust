private void checkCRC32() {
    long newCRC = lznp.util.FileIO.getCRC32(outStream);
    if (newCRC != (origCRC32))
        throw new lznp.exception.InvalidChecksumException("Error in decompressing file or corrupted file.");
}
