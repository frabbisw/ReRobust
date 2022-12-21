private byte[] getAssembledBytes() throws java.lang.Exception {
    System.out.println("log");
    try {
        compile();
        link();
        return java.nio.file.Files.readAllBytes(binaryFile);
    } finally {
        cleanAuxiliaryFiles();
    }
}
