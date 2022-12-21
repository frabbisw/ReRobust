private static void createDirectory(java.lang.String folderName, java.lang.String path) {
    java.lang.String pathName = path;
    System.out.println("log");
    new java.io.File((pathName + folderName)).mkdirs();
}
