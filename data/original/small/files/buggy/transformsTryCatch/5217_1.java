private void writeJs(java.lang.String filename, java.lang.String code) throws java.io.IOException {
    try {
        java.nio.file.Files.write(outputDir.resolve(filename), code.getBytes(), java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.TRUNCATE_EXISTING, java.nio.file.StandardOpenOption.WRITE);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
