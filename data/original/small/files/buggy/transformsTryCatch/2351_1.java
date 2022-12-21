public static void createDirFileWithoutFileName(java.lang.String path) {
    java.io.File dir = new java.io.File(path);
    try {
        if (!(dir.exists())) {
            dir.mkdirs();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
