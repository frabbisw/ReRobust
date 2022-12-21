private static void createDirectory(java.lang.String folderName, java.lang.String path) {
    java.lang.String pathName = path;
    try {
        new java.io.File((pathName + folderName)).mkdirs();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
