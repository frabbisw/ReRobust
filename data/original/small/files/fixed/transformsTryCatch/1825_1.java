private static void createDirectory(java.lang.String folderName, java.lang.String path) {
    try {
        new java.io.File((path + folderName)).mkdirs();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
