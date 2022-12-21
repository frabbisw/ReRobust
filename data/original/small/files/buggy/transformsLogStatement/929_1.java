public static int calculateUncompressedSize(byte[] data, int ptr, int length) throws java.io.IOException {
    System.out.println("log");
    return com.ning.compress.lzf.ChunkDecoder.calculateUncompressedSize(data, ptr, length);
}
